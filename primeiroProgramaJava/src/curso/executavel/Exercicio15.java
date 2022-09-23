package curso.executavel;

import java.util.Scanner;

/*
 * Elabore um programa para ler 20 números inteiros. Depois escreva os números que estão nas 
 * posições pares em ordem crescente.
 * */
public class Exercicio15 {

	public static void main(String[] args) {
		int i, y = 0, j, aux;
		int vetor[] = new int[5];
		String continua;

		Scanner ler = new Scanner(System.in);

		do {

			for (i = 0; i < vetor.length; i++) {
				System.out.println("Entre com o vetor " + i + "º :");
				vetor[i] = ler.nextInt();
			}

			/*
			 * vetor[5]
			 * 
			 * int novoVetor[] = new int[vetor.length/2 + vetor.length % 2]; [10/2 + 10 % 2]
			 * [ 5 + 0] [5] A linha acima vai transformar em metade do total do indice, ou
			 * seja, se o indice vale 10 posições vai atualizar para 5 posições, que seria a
			 * metade.
			 */

			int novoVetor[] = new int[vetor.length / 2 + vetor.length % 2];
			for (i = 0; i < vetor.length; i++) {
				if (i % 2 == 0) {

					novoVetor[y] = vetor[i];
					y++; // armazena somente os números pares
				}

			}

			System.out.println("--------------------------");

			for (y = 0; y < novoVetor.length - 1; y++) {
				for (j = y + 1; j < novoVetor.length; j++) {
					if (novoVetor[y] > novoVetor[j]) {
						aux = novoVetor[y];
						novoVetor[y] = novoVetor[j];
						novoVetor[j] = aux;
					} // final do if
				} // final do for j
			}

			for (y = 0; y < novoVetor.length; y++) {
				System.out.println(novoVetor[y]);
			}

			System.out.println("Deseja continuar com o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while ("S".equals(continua));

	}

}
