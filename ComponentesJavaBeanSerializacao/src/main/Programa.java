package main;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import introducao.Pessoa;
import java.io.*;

public class Programa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("John Doe");
		p.setIdade(20);
		XMLEncoder encoder = null;
		try {
			encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("pessoa.xml")));
			encoder.writeObject(p);
		} catch (Exception e) {
			System.out.println("Erro ao escrever arquivo");
		} finally {
			if (encoder != null) {
				encoder.close();
			}
		}
		XMLDecoder decoder = null;
		Pessoa outro = null;
		try {
			decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("pessoa.xml")));
			outro = (Pessoa) decoder.readObject();
			System.out.println(outro);
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo");
		} finally {
			if (decoder != null) {
				decoder.close();
			}
		}
	}

}
