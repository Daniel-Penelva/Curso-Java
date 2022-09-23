package curso.executavel;

import java.util.Scanner;

/*
 * Elabore um programa para ler uma variável composta unidimensional (B) de 5 números reais. 
 * Calcule a média e escreva os números menores que a média.
 * */

public class Exercicio12 {

	public static void main(String[] args) {
		int b[] = new int[5];
		double media;
		int soma = 0, i;
		String continua;

		Scanner ler = new Scanner(System.in);

		do {
			for (i = 0; i < b.length; i++) {
				System.out.println("Entre com o " + i + "º valor do vetor: ");
				b[i] = ler.nextInt();
			}

			for (i = 0; i < b.length; i++) {
				soma = soma + b[i]; // ou << soma += vetor[i]; >>
			}

			// no caso b (variavel) mais o tamanho do vetor "length" que é 5.
			// Logo,
			// b.length = 5.
			media = soma / b.length; // ou media = soma / i;
			System.out.println("Média: " + media);

			for (i = 0; i < b.length; i++) {

				if (b[i] < media) {
					System.out.println("Vetor da posição " + i + "º = " + b[i]);
				}
			}

			System.out.println("Deseja continuar o programa (S/N)?:");
			continua = ler.next().toUpperCase();
		} while ("S".equals(continua));
	}

}
