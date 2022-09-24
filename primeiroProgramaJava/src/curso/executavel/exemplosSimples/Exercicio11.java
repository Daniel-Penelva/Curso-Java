package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Construa um programa que leia uma variável composta unidimensional A de 5 elementos reais. 
 * Depois escreva: 
 * a) os elementos das posições pares de A divididos por 5; 
 * b) os elementos das posições ímpares de A multiplicados por 10; 
 * c) a soma de todos os elementos de posições pares.
 * */

public class Exercicio11 {

	public static void main(String[] args) {

		String continua;
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[4];

		do {

			// Capturando os dados de entrada
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Entre com o " + i + "º valor:");
				vetor[i] = ler.nextInt();
			}

			// Elementos da posição pares
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] % 2 == 0) {
					if (vetor[i] == 0) {
						System.out.println("Não existe divisão por zero!");
					} else {
						// Os elementos das posições pares de A divididos por 5
						int dividir = vetor[i] / 5;
						System.out.println("Valores pares");
						System.out.println("Vetor da posição " + i + "º é: " + dividir);

						// A soma de todos os elementos de posições pares.

						soma += vetor[i]; // soma = soma + vetor[i]
					}
				}
			}

			System.out.println("\n\n");

			// Os elementos das posições ímpares de A multiplicados por 10
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] % 2 == 1) {
					int multiplica = vetor[i] * 10;
					System.out.println("Valores impares");
					System.out.println("Vetor da posição " + i + "º é: " + multiplica);
				}
			}

			System.out.println("Soma de todos os elementos de posições pares: " + soma);

			System.out.println("Deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while (continua.equals("S"));

	}

}
