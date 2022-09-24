package curso.executavel.exemplosVetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// cria um vetor de 4 posições
		int vetor[] = new int[4];

		// manipulando os valores atraves do indice(posição)
		Scanner lista = new Scanner(System.in);
		System.out.println("Informe 4 valores inteiros para a lista.");

		System.out.println("Informe 1º valor inteiro para a lista? ");
		vetor[0] = lista.nextInt();
		System.out.println("Informe 2º valor inteiro para a lista? ");
		vetor[1] = lista.nextInt();
		System.out.println("Informe 3º valor inteiro para a lista? ");
		vetor[2] = lista.nextInt();
		System.out.println("Informe 4º valor inteiro para a lista? ");
		vetor[3] = lista.nextInt();

		System.out.println("Lista: " + vetor[0] + '-' + vetor[1] + '-' + vetor[2] + '-' + vetor[3]);

		// ou

		System.out.println("\n\n");

		for (int i = 0; i < 4; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println("Array invertido!!!");

		for (int j = 4 - 1; j >= 0; j--) {
			System.out.println(vetor[j]);
		}

	}

}
