package main;

import genericos.Par;

public class Programa {

	public static void main(String[] args) {
		Par<String,Integer> umPar = new Par<String,Integer>("A", 1);
		System.out.println(umPar);
	}

}
