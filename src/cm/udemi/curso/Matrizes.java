package cm.udemi.curso;

import java.util.Scanner;

public class Matrizes {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.println("Quantas linhas a matriz terá?");
		int linhas = entrada.nextInt();

		System.out.println("Quantas colunas a matriz terá?");
		int colunas = entrada.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Linha #" + i);
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" Coluna %d: %n  Digite o valor: ", j);
				matriz[i][j] = entrada.nextInt();
			}
		}

		System.out.println("Digite o número desejado:");
		int numero = entrada.nextInt();
		int left = 0, right = 0, down = 0, up = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j > 0)
					left = matriz[i][j - 1];
				if (i > 0)
					up = matriz[i - 1][j];
				if (j < matriz[i].length - 1)
					right = matriz[i][j + 1];
				if (i < matriz.length - 1)
					down = matriz[i + 1][j];

				if (numero == matriz[i][j]) {
					System.out.printf("Posição: %d,%d %n Left: %d, Right: %d, Down: %d, Up: %d. %n", i, j, left, right,
							down, up);
				}
			}
		}
	}
}
