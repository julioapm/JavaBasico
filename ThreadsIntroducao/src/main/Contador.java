package main;

public class Contador implements Runnable {
	private String nome;

	public Contador(String n) {
		nome = n;
	}

	@Override
	public void run() {
		System.out.println("Criando o contador: " + nome);
		for (int i = 0; i < 100; i++) {
			System.out.println(nome + ": " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(nome + " encerrando.");
	}

}
