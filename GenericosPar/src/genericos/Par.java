package genericos;

public class Par<T,U> {
	private T componente1;
	private U componente2;
	
	public Par(T componente1, U componente2) {
		this.componente1 = componente1;
		this.componente2 = componente2;
	}

	public T getComponente1() {
		return componente1;
	}

	public U getComponente2() {
		return componente2;
	}

	@Override
	public String toString() {
		return "Par [componente1=" + componente1 + ", componente2=" + componente2 + "]";
	}
	
}
