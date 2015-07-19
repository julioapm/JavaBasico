package introducao;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = -6660303065217851028L;
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + " Idade=" + idade;
	}
}
