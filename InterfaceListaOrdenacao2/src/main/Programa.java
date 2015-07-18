package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import introducao.Pessoa;

public class Programa {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("John Doe", 22));
		lista.add(new Pessoa("Mary Doe", 18));
		Collections.sort(lista, new Pessoa.ComparadorIdade());
		System.out.println(lista);
		Collections.sort(lista, Pessoa.getComparadorNome());
		System.out.println(lista);
	}

}
