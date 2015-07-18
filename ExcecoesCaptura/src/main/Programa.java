package main;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		int valor = 0;
		String s = JOptionPane.showInputDialog("Digite um valor inteiro:");
		try {
			// m�todo parseInt() pode gerar exce��o
			valor = Integer.parseInt(s);
			System.out.println(valor);
		} catch (NumberFormatException e) {
			// c�digo para tratar a exce��o
			System.out.println("Erro de convers�o");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Sempre executado");
		}
	}

}
