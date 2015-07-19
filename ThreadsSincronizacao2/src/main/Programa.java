package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Programa {

	public static void main(String[] args) {
		Contador c = new Contador();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ThreadContador(c));
		executor.execute(new ThreadContador2(c));
		executor.shutdown();
	}

}
