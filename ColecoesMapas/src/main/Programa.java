package main;

import java.util.HashMap;

public class Programa {

	public static void main(String[] args) {
		HashMap<String, String> dicionario = new HashMap<String, String>();
		dicionario.put("casa",
				"sf (lat casa) 1 Nome comum a todas as constru��es destinadas a moradia. 2 Moradia, resid�ncia, vivenda. Col: casaria, casario, taba (para casas de �ndios).");
		dicionario.put("casebre",
				"(�) sm (casa+ebre) 1 Casa pequena e velha ou em ru�nas. 2 Casa pobre, humilde. 3 Cabana, cho�a, choupana, tug�rio.");
		dicionario.put("cabana",
				"sf (lat tardio capanna) Pequena casa r�stica ordinariamente constru�da de madeira e coberta de colmo; arribana, capuaba, cop�, ipuaba, mocambo, mocambinho, moqui�o, quimbembe, tapiri, palho�a.");
		for (String chave : dicionario.keySet()) {
			System.out.println(chave);
			System.out.println(dicionario.get(chave));
		}
	}

}
