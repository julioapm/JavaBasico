package main;

import java.util.HashMap;

public class Programa {

	public static void main(String[] args) {
		HashMap<String, String> dicionario = new HashMap<String, String>();
		dicionario.put("casa",
				"sf (lat casa) 1 Nome comum a todas as construções destinadas a moradia. 2 Moradia, residência, vivenda. Col: casaria, casario, taba (para casas de índios).");
		dicionario.put("casebre",
				"(é) sm (casa+ebre) 1 Casa pequena e velha ou em ruínas. 2 Casa pobre, humilde. 3 Cabana, choça, choupana, tugúrio.");
		dicionario.put("cabana",
				"sf (lat tardio capanna) Pequena casa rústica ordinariamente construída de madeira e coberta de colmo; arribana, capuaba, copé, ipuaba, mocambo, mocambinho, moquiço, quimbembe, tapiri, palhoça.");
		for (String chave : dicionario.keySet()) {
			System.out.println(chave);
			System.out.println(dicionario.get(chave));
		}
	}

}
