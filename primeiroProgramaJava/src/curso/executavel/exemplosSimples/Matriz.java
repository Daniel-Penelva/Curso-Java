package curso.executavel.exemplosSimples;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		float matriz[][] = new float[2][2];
		int i, j;

		Scanner s = new Scanner(System.in);

		System.out.println("Informe 4 valores do tipo real.");

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Entre com a " + (i + 1) + "º linha da " + (j + 1) + "º coluna ?");
				matriz[i][j] = (float) s.nextFloat();
			}
		}

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}

}
