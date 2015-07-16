package main;

import introducao.Professor;

public class Programa {

	public static void main(String[] args) {
		int[] valores = new int[5];
		for(int v : valores) {
			System.out.println(v);
		}
		System.out.println("---------------");
		
		
		valores[0] = 1;
		valores[1] = 2;
		for(int i = 0; i<valores.length; i++){
			System.out.println(valores[i]);
		}
		System.out.println("---------------");
		
		
		String[] nomes = {"eu","tu"};
		for(String s : nomes) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		
		Professor[] lista = new Professor[10];
		lista[0] = new Professor("Maria","13",12);
		lista[1] = new Professor("José","234",8);
		for(Professor p : lista) {
			if(p!=null){
				System.out.println(p.getNome());
			}
		}
		System.out.println("---------------");
	}

}
