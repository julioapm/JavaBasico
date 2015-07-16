package introducao;

public class Circulo extends FiguraBidimensional {
	private int raio;

	public Circulo(int x, int y, int r) {
		super(x, y);
		raio = r;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	public int getRaio() {
		return raio;
	}

	
}
