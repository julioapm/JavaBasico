package main;

import java.util.List;
import java.util.concurrent.Callable;

public class Pesquisador implements Callable<Integer> {
	private List<Integer> lista;

	public Pesquisador(List<Integer> umaLista) {
		lista = umaLista;
	}

	@Override
	public Integer call() throws Exception {
		int maior = lista.get(0);
		for (Integer val : lista) {
			if (maior < val)
				maior = val;
		}
		return maior;
	}

}
