package main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Programa {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Título da janela");
		janela.setBounds(50, 100, 400, 150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().add(new JButton("Aperte-me"));
		janela.setVisible(true);
	}

}
