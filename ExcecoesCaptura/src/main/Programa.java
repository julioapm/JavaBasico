package main;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		int valor = 0;
		String s = JOptionPane.showInputDialog("Digite um valor inteiro:");
		try {
			// método parseInt() pode gerar exceção
			valor = Integer.parseInt(s);
			System.out.println(valor);
		} catch (NumberFormatException e) {
			// código para tratar a exceção
			System.out.println("Erro de conversão");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Sempre executado");
		}
	}

}
