package geometria;

public class Circulo {
	public static final double PI = 3.14;
	private int centrox;
	private int centroy;
	private int raio;

	public Circulo(int x, int y, int r) {
		if (x < 0) {
			IllegalArgumentException excecao = new IllegalArgumentException("Valor de x negativo");
			throw excecao;
		} else {
			centrox = x;
		}
		if (y < 0) {
			IllegalArgumentException excecao = new IllegalArgumentException("Valor de y negativo");
			throw excecao;
		} else {
			centroy = y;
		}
		if (r <= 0) {
			IllegalArgumentException excecao = new IllegalArgumentException("Valor de r negativo ou nulo");
			throw excecao;
		} else {
			raio = r;
		}
	}

	public Circulo() {
		this(0, 0, 1);
	}

	public int getCentrox() {
		return centrox;
	}

	public void setCentrox(int centrox) {
		this.centrox = centrox;
	}

	public int getCentroy() {
		return centroy;
	}

	public void setCentroy(int centroy) {
		this.centroy = centroy;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public double area() {
		return PI * raio * raio;
	}

	public double circunferencia() {
		return 2 * PI * raio;
	}

	public int diametro() {
		return 2 * raio;
	}

	public static String equacaoGeral(int x, int y, int r) {
		int a = -2 * x;
		int b = -2 * y;
		int c = (x * x) + (y * y) - (r * r);
		StringBuffer eq = new StringBuffer("x2 + y2");
		if (a > 0) {
			eq.append(" + ");
			eq.append(a);
			eq.append("x");
		} else if (a < 0) {
			eq.append(" ");
			eq.append(a);
			eq.append("x");
		}
		if (b > 0) {
			eq.append(" + ");
			eq.append(b);
			eq.append("y");
		} else if (b < 0) {
			eq.append(" ");
			eq.append(b);
			eq.append("y");
		}
		if (c > 0) {
			eq.append(" + ");
			eq.append(c);
		} else if (c < 0) {
			eq.append(" ");
			eq.append(c);
		}
		eq.append(" = 0");
		return eq.toString();
	}

}
