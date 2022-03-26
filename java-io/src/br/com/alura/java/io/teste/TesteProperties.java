package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {

	public static void main(String[] args) throws IOException {
		// Escrita de arquivo propertis
//		Properties props = new Properties();
//		props.setProperty("login", "alura");
//		props.setProperty("senha", "alurapass");
//		props.setProperty("endereco", "www.alura.com.br");

		//  o método store, da classe Properties recebe um stream ou writer
//		props.store(new FileWriter("conf.properties"), "teste");
		
		// Leitura de properties
		// Para ler esse arquivo de properties, basta usar o método load
		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");
		
		System.out.println(login + ", " + senha + ", " + ", " + endereco);
	}

}
