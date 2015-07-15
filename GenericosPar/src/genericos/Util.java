package genericos;

import java.util.List;

public class Util {
	public static <T, U> boolean compare(Par<T, U> p1, Par<T, U> p2) {
		return p1.getComponente1().equals(p2.getComponente1()) && p1.getComponente2().equals(p2.getComponente2());
	}

	public static <T extends Comparable<T>> int contaMaiorQue(T[] umArray, T elem) {
		int count = 0;
		for (T e : umArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void imprime(List<?> umaLista) {
		for (Object elem: umaLista)
	        System.out.print(elem + " ");
	    System.out.println();
	}
}
