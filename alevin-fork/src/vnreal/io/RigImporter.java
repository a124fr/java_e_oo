package vnreal.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vnreal.network.substrate.SubstrateLink;
import vnreal.network.substrate.SubstrateNetwork;
import vnreal.network.substrate.SubstrateNode;
import vnreal.resources.BandwidthResource;

/**
 * This class implements an import filter to parse .rig files, as generated by
 * IGen. The topology is imported as an {@link SubstrateNetwork}.
 * 
 * @author Philip Huppert
 */
public class RigImporter {
	
	/**
	 * This class implements an exception that is thrown when a .rig file could
	 * not be parsed.
	 * 
	 * @author Philip Huppert
	 */
	public static class RigImportException extends Exception {
		private static final long serialVersionUID = 1L;
		private String message = null;

		public RigImportException() {
		}

		public RigImportException(String message) {
			this.message = message;
		}

		public RigImportException(Throwable cause) {
			this.initCause(cause);
		}

		public RigImportException(String message, Throwable cause) {
			this.initCause(cause);
			this.message = message;
		}

		@Override
		public String getMessage() {
			return this.message;
		}
	}

	/**
	 * Bean to hold a vertex read from the .rig file.
	 * 
	 * @author Philip Huppert
	 */
	private static class Vertex {
		public String id;
		public Double lat;
		public Double lon;
		public String asNumber;
		public String name;
	}

	/**
	 * Bean to hold an edge read from the .rig file.
	 * 
	 * @author Philip Huppert
	 */
	private static class Edge {
		public Vertex vertA;
		public Vertex vertB;
		public String type;
		public Long bandwidth;
		public Double weight;
		public Double delay;
		public Double length;
	}

	/**
	 * Bean to hold a network from the .rig file.
	 * 
	 * @author Philip Huppert
	 */
	private static class Network {
		public List<Vertex> vertices;
		public List<Edge> edges;
	}

	private RigImporter() {}

	/**
	 * Import topology from .rig file as {@link SubstrateNetwork}.
	 * 
	 * @param file
	 *            to import from.
	 * @return the imported topology.
	 * @throws IOException
	 *             if the file could not be read.
	 * @throws RigImportException
	 *             if the file could not be parsed.
	 */
	public static SubstrateNetwork importNetwork(File file) throws IOException, RigImportException {
		FileInputStream fis = null;
		SubstrateNetwork result = null;

		try {
			fis = new FileInputStream(file);
			result = RigImporter.importNetwork(fis);
		} finally {
			if (fis != null) {
				fis.close();
			}
		}

		return result;
	}

	/**
	 * Import topology from .rig stream as {@link SubstrateNetwork}.
	 * 
	 * @param input
	 *            stream to import from.
	 * @return the imported topology.
	 * @throws IOException
	 *             if the stream could not be read.
	 * @throws RigImportException
	 *             if the stream could not be parsed.
	 */
	public static SubstrateNetwork importNetwork(InputStream input) throws IOException, RigImportException {
		Network network = RigImporter.parseFile(input);
		SubstrateNetwork substrate = RigImporter.constructSubstrateNetwork(network);
		return substrate;
	}

	private static Network parseFile(InputStream input) throws IOException,
			RigImportException {
		BufferedReader br = null;
		List<Vertex> verts = null;
		List<Edge> edges = null;
		Map<String, Vertex> vertsById = null;
	
		try {
			br = new BufferedReader(new InputStreamReader(input));
	
			boolean parsedHeader = false;
			int lineNumber = 0;
			int numVerts = 0, numEdges = 0;
			int curVert = 0, curEdge = 0;
	
			while (true) {
				String line = br.readLine();
				++lineNumber;
	
				// Stop parsing at EOF.
				if (line == null) {
					break;
				}
	
				// Ignore comments.
				if (line.startsWith("#")) {
					continue;
				}
	
				String[] fields = line.split("\t");
	
				if (!parsedHeader) {
					// Sanity check.
					if (fields.length != 2) {
						throw new RigImportException(String.format(
								"Malformed header in line %d: Wrong number of fields.",
								lineNumber));
					}
	
					// Extract number of vertices and edges from header.
					try {
						numVerts = Integer.parseInt(fields[0]);
						numEdges = Integer.parseInt(fields[1]);
					} catch (NumberFormatException e) {
						throw new RigImportException(String.format(
								"Malformed header in line %d: Number format.",
								lineNumber), e);
					}
	
					// Allocate lists for vertices and edges.
					verts = new ArrayList<Vertex>(numVerts);
					edges = new ArrayList<Edge>(numEdges);
					vertsById = new HashMap<String, Vertex>(numVerts);
	
					parsedHeader = true;
	
				} else if (curVert < numVerts) {
					Vertex vert = RigImporter.parseVertex(lineNumber, fields);
					verts.add(vert);
					vertsById.put(vert.asNumber + ":" + vert.id, vert);
					++curVert;
	
				} else if (curEdge < numEdges) {
					Edge edge = RigImporter.parseEdge(lineNumber, fields, vertsById);
					edges.add(edge);
					++curEdge;
				}
			}
		} finally {
			if (br != null) {
				br.close();
			}
		}
	
		Network network = new Network();
		network.vertices = verts;
		network.edges = edges;
		return network;
	}

	private static SubstrateNetwork constructSubstrateNetwork(Network network) {
		// Build substrate network.
		SubstrateNetwork substrate = new SubstrateNetwork(false);
	
		// Convert vertices to substrate nodes.
		Map<Vertex, SubstrateNode> vertToSubnode = new HashMap<Vertex, SubstrateNode>();
		for (Vertex vert : network.vertices) {
			SubstrateNode node = new SubstrateNode();
	
			node.setCoordinateX(vert.lon);
			node.setCoordinateY(-1*vert.lat);
	
			String name = vert.asNumber+":"+vert.id;
			if (vert.name != null) {
				name += " (" + vert.name + ")";
			}
			node.setName(name);
	
			substrate.addVertex(node);
			vertToSubnode.put(vert, node);
		}
	
		// Convert edges to substrate links.
		for (Edge edge : network.edges) {
			SubstrateLink linkA = new SubstrateLink();
			SubstrateLink linkB = new SubstrateLink();
	
			if (edge.bandwidth != null) {
				BandwidthResource bwA = new BandwidthResource(linkA);
				bwA.setBandwidth((double) edge.bandwidth);
				linkA.add(bwA);
	
				BandwidthResource bwB = new BandwidthResource(linkB);
				bwB.setBandwidth((double) edge.bandwidth);
				linkB.add(bwB);
			}
	
			// TODO convert type, weight, delay and length to resources
	
			SubstrateNode nodeA = vertToSubnode.get(edge.vertA);
			SubstrateNode nodeB = vertToSubnode.get(edge.vertB);
			substrate.addEdge(linkA, nodeA, nodeB);
			substrate.addEdge(linkB, nodeB, nodeA);
		}
	
		return substrate;
	}

	private static Edge parseEdge(int lineNumber, String[] fields,
			Map<String, Vertex> vertsById) throws RigImportException {
		// Sanity check.
		if (fields.length != 7) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Wrong number of fields.",
					lineNumber));
		}

		// Create temporary object representation of line/edge.
		Edge edge = new Edge();
		edge.type = fields[2];
		edge.vertA = vertsById.get(fields[0]);
		edge.vertB = vertsById.get(fields[1]);
		if (edge.vertA == null || edge.vertB == null) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Unknown vertex.",
					lineNumber));
		}
		

		try {
			edge.bandwidth = RigImporter.parseLong(fields[3]);
		} catch (NumberFormatException e) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Bandwidth format.",
					lineNumber), e);
		}
	
		try {
			edge.weight = RigImporter.parseDouble(fields[4]);
		} catch (NumberFormatException e) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Weight format.",
					lineNumber), e);
		}

		try {
			edge.delay = RigImporter.parseDouble(fields[5]);
		} catch (NumberFormatException e) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Delay format.",
					lineNumber), e);
		}

		try {
			edge.length = RigImporter.parseDouble(fields[6]);
		} catch (NumberFormatException e) {
			throw new RigImportException(String.format(
					"Malformed edge in line %d: Length format.",
					lineNumber), e);
		}

		return edge;
	}

	private static Double parseDouble(String data) {
		if (data.equals("undef")) {
			return null;
		} else {
			return Double.parseDouble(data);
		}
	}

	private static Long parseLong(String data) {
		if (data.equals("undef")) {
			return null;
		} else {
			return Long.parseLong(data);
		}
	}

	private static Vertex parseVertex(int lineNumber, String[] fields)
			throws RigImportException {
		// Sanity check.
		if (fields.length < 4 || fields.length > 5) {
			throw new RigImportException(String.format(
					"Malformed vertex in line %d: Wrong number of fields.",
					lineNumber));
		}

		// Create temporary object representation of line/vertex.
		Vertex vert = new Vertex();
		vert.id = fields[0];
		vert.asNumber = fields[3];
		vert.name = (fields.length == 5) ? fields[4] : null;

		try {
			vert.lat = Double.parseDouble(fields[1]);
			vert.lon = Double.parseDouble(fields[2]);
		} catch (NumberFormatException e ){
			throw new RigImportException(String.format(
					"Malformed vertex in line %d: Coordinate format.",
					lineNumber), e);
		}
		return vert;
	}

}
