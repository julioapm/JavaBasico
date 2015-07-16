package main;

import geometria.Circulo;

public class Programa {

	public static void main(String[] args) {
		Circulo circ1 = new Circulo();
		Circulo circ2 = new Circulo(1, 2, -4);
		System.out.println("Area circ1= " + circ1.area());
		System.out.println("Area circ2= " + circ2.area());
	}

}
