/* ***** BEGIN LICENSE BLOCK *****
 * Copyright (C) 2008-2011, The 100GET-E3-R3G Project Team.
 * 
 * This work has been funded by the Federal Ministry of Education
 * and Research of the Federal Republic of Germany
 * (BMBF Förderkennzeichen 01BP0775). It is part of the EUREKA project
 * "100 Gbit/s Carrier-Grade Ethernet Transport Technologies
 * (CELTIC CP4-001)". The authors alone are responsible for this work.
 *
 * See the file AUTHORS for details and contact information.
 * 
 * This file is part of MuLaViTo (Multi-Layer Visualization Tool).
 *
 * MuLaViTo is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License Version 3 or later
 * (the "GPL"), or the GNU Lesser General Public License Version 3 or later
 * (the "LGPL") as published by the Free Software Foundation.
 *
 * MuLaViTo is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * or the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License and
 * GNU Lesser General Public License along with MuLaViTo; see the file
 * COPYING. If not, see <http://www.gnu.org/licenses/>.
 *
 * ***** END LICENSE BLOCK ***** */
package mulavito.graph.generators;

import mulavito.graph.IEdge;
import mulavito.graph.ILayer;
import mulavito.graph.IVertex;

/**
 * A common interface for generating different kinds of graphs.
 * 
 * @author Michael Duelli
 */
public interface IEdgeGenerator<V extends IVertex, E extends IEdge> {
	/**
	 * Generate edges for a graph.
	 * 
	 * @param g
	 *            The graph.
	 */
	public void generate(ILayer<V, E> g);
}