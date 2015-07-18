package introducao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	@Override
	public int compareTo(Pessoa o) {
		if (idade < o.idade)
			return -1;
		if (idade > o.idade)
			return 1;
		return 0;
	}
	
	//Comparator como uma classe interna
	public static class ComparadorIdade implements Comparator<Pessoa> {

		@Override
		public int compare(Pessoa o1, Pessoa o2) {
			if(o1.idade < o2.idade)
				return -1;
			if(o1.idade > o2.idade)
				return 1;
			return 0;
		}
		
	}
	
	//Comparator como uma classe interna anônima
	public static Comparator<Pessoa> getComparadorNome() {
		return new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.nome.compareTo(o2.nome);
			}
		};
	}
}
