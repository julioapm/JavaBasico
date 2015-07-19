package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Programa {

	public static void main(String[] args) {
		System.out.println("O main comecou ...");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(new Contador("contador1"));
		executor.execute(new Contador("contador2"));
		executor.execute(new Contador("contador3"));
		System.out.println("Threads criadas.");
		for (int i = 0; i < 100; i++) {
			double calculo = Math.sqrt((double) i);
			System.out.println("Estou fazendo outra coisa: " + calculo);
		}
		System.out.println("O main terminou.");
		executor.shutdown();
	}

}
