package introducao;

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
}
