package main;

import introducao.Produto;
import introducao.ProdutoPerecivel;

public class Programa {

	public static void main(String[] args) {
		Produto p1 = new Produto("P1", 1.99);
		Produto p2 = new ProdutoPerecivel("P2",1.9,1,12,2015);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("P2 é compatível com o tipo Produto? " + (p2 instanceof Produto));
		System.out.println("P2 é do tipo Produto? " + (p2.getClass() == Produto.class));
	}

}
