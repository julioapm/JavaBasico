package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import introducao.Pessoa;

public class Programa {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<String>();
		lista1.add("B");
		lista1.add("C");
		lista1.add("A");
		Collections.sort(lista1);
		System.out.println(lista1);
		
		List<Pessoa> lista2 = new ArrayList<Pessoa>();
		lista2.add(new Pessoa("John Doe", 22));
		lista2.add(new Pessoa("Mary Doe", 18));
		Collections.sort(lista2);
		System.out.println(lista2);
	}

}
