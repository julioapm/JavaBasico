package main;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("eu");
		palavras.add("ele");
		palavras.add(1,"tu");
		for(int i=0; i<palavras.size(); i++) {
			System.out.println(palavras.get(i));
		}
		System.out.println("---------");
		palavras.remove(0);
		for(int i=0; i<palavras.size(); i++) {
			System.out.println(palavras.get(i));
		}
	}

}
