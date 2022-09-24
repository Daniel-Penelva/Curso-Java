package curso.executavel.exemplosVetor;

import java.util.Scanner;

public class Vetor5 {

	public static void main(String[] args) {
		// manipulando os valores atraves do indice(posição)
		Scanner lista = new Scanner(System.in);

		// cria um vetor de 4 posições
		int vetor[] = new int[4];

		int i = 0;
		while (i < 4) {
			System.out.println("Entre com o valor desejado na posição " + (i + 1) + "º ?");
			vetor[i] = lista.nextInt();
			i++;
		}

		System.out.println("\n\n");

		for (i = 0; i < 4; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println("Array invertido");
		for (int j = 4 - 1; j >= 0; j--) {
			System.out.println(vetor[j]);
		}

	}

}
