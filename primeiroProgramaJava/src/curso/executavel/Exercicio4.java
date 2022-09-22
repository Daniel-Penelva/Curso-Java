package curso.executavel;

import java.util.Scanner;

/*
 * Faça um programa que diga se o número é par ou impar.
 * */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um número inteiro: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Número: " + numero + " é par!");
		}
		if (numero % 2 == 1) {
			System.out.println("Número: " + numero + " é impar!");
		}
	}

}
