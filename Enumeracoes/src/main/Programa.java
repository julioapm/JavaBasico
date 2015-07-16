package main;

import introducao.Coin;
import introducao.Naipes;

public class Programa {

	public static void main(String[] args) {
		//Exemplo do enum Naipes
		for(Naipes n : Naipes.values()) {
			System.out.println(n);
		}
		
		//Exemplo do enum Coin
		for(Coin c : Coin.values()) {
			System.out.println(c + " : " + c.value());
		}
	}

}
