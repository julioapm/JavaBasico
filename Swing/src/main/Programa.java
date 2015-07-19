package main;

import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		// Cria o objeto gráfico para a janela
		JFrame janela = new JFrame("Título da janela");
		// Seta posição e tamanho
		janela.setBounds(50, 100, 400, 150);
		// Ação ao fechar a janela = sair do programa
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Exibe a janela
		janela.setVisible(true);
	}

}
