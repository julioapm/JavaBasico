package main;

import java.util.ArrayList;

import genericos.Par;
import genericos.Util;

public class Programa {

	public static void main(String[] args) {
		Par<String,Integer> umPar = new Par<String,Integer>("A", 1);
		System.out.println(umPar);
		Par<String,Integer> outroPar = new Par<String,Integer>("B", 1);
		System.out.println(Util.compare(umPar, outroPar));
		ArrayList<Par<String,Integer>> lista = new ArrayList<Par<String,Integer>>();
		lista.add(umPar);
		lista.add(outroPar);
		Util.imprime(lista);
	}

}
