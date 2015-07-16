package main;

import introducao.Circulo;
import introducao.FiguraBidimensional;

public class Programa {

	public static void main(String[] args) {
		FiguraBidimensional circ1 = new Circulo(1,2,3);
		System.out.println("Area circ1= " + circ1.area());
	}

}
