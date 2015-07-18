package main;

import introducao.Perecivel;
import introducao.Produto;
import introducao.ProdutoPerecivel;

public class Programa {

	public static void main(String[] args) {
		Perecivel p1 = new ProdutoPerecivel("P2",1.9,1,12,2015);
		System.out.println(p1);
		
		System.out.println("P1 é compatível com o tipo Perecivel? " + (p1 instanceof Perecivel));
		System.out.println("P1 é do tipo Perecivel? " + (p1.getClass() == Perecivel.class));
	}

}
