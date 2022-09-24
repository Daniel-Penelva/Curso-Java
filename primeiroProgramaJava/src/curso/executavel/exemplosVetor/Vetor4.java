package curso.executavel.exemplosVetor;

import java.util.Scanner;

public class Vetor4 {

	public static void main(String[] args) {
		// Foram instanciados dois objetos, um para entrada de dados e o outro para
		// inserir no vetor
		Scanner lista = new Scanner(System.in);
		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + i + "º numero? ");
			vetor[i] = lista.nextInt();
		}

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
