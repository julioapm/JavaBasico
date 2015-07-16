package main;

public class Programa {

	public static void main(String[] args) {
		int[][] valores = new int[3][2];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 2; j++)
				valores[i][j] = i + j;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------");

		int[][] ndim = new int[2][];
		ndim[0] = new int[2];
		ndim[1] = new int[3];
		for (int i = 0; i < ndim.length; i++)
			for (int j = 0; j < ndim[i].length; j++)
				ndim[i][j] = i + j;
		for (int i = 0; i < ndim.length; i++) {
			for (int j = 0; j < ndim[i].length; j++) {
				System.out.print(ndim[i][j] + " ");
			}
			System.out.println();
		}
	}

}
