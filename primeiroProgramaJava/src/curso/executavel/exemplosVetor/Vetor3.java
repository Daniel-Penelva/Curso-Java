package curso.executavel.exemplosVetor;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		// Foram instanciados dois objetos, um para entrada de dados e o outro para
		// inserir no vetor
		Scanner lista = new Scanner(System.in);
		int[] vetor = new int[10];

		// 1º valor
		System.out.println("Digite o 1º valor? ");
		vetor[0] = lista.nextInt();

		// 2º valor
		System.out.println("Digite o 2º valor");
		vetor[1] = lista.nextInt();

		// 3º valor
		System.out.println("Digite o 3º valor");
		vetor[2] = lista.nextInt();

		// 4º valor
		System.out.println("Digite o 4º valor");
		vetor[3] = lista.nextInt();

		// 5º valor
		System.out.println("Digite o 5º valor");
		vetor[4] = lista.nextInt();

		// 6º valor
		System.out.println("Digite o 6º valor");
		vetor[5] = lista.nextInt();

		// 7º valor
		System.out.println("Digite o 7º valor");
		vetor[6] = lista.nextInt();

		// 8º valor
		System.out.println("Digite o 8º valor");
		vetor[7] = lista.nextInt();

		// 9º valor
		System.out.println("Digite o 9º valor");
		vetor[8] = lista.nextInt();

		// 10º valor
		System.out.println("Digite o 10º valor");
		vetor[9] = lista.nextInt();

		// ordem crescente

		int i, y, auxiliar;

		for (i = 0; i < 9; i++) {
			for (y = i + 1; y < 10; y++) {
				if (vetor[i] > vetor[y]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[y];
					vetor[y] = auxiliar;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido");
		for (i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

	}

}
