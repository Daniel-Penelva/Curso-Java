package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Fazer um algoritmo que implemente uma calculadora (as 4 operações aritméticas: +, -, /, *). 
 * O programa deverá perguntar qual é a operação desejada e depois os dois números que serão 
 * usadas na operação. Pode-se usar a estrutura “switch” ou usar “se´s” aninhados.
 * */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, resulta;
		int opcao;

		// Garante entrar no while
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Calculadora Esperta");
			System.out.println("<1> Adição.");
			System.out.println("<2> Subtração.");
			System.out.println("<3> Multiplicação.");
			System.out.println("<4> Divisão;");
			System.out.println("Entre com a opção: ");
			opcao = ler.nextInt();

			if (opcao == 1) {

				System.out.println("Entre com numero 1: ");
				n1 = ler.nextDouble();
				System.out.println("Entre com o numero 2: ");
				n2 = ler.nextDouble();

				resulta = n1 + n2;
				System.out.println("Resultado: " + resulta);
			} else if (opcao == 2) {
				System.out.println("Entre com numero 1: ");
				n1 = ler.nextDouble();
				System.out.println("Entre com o numero 2: ");
				n2 = ler.nextDouble();

				resulta = n1 - n2;
				System.out.println("Resultado: " + resulta);

			} else if (opcao == 3) {
				System.out.println("Entre com numero 1: ");
				n1 = ler.nextDouble();
				System.out.println("Entre com o numero 2: ");

				n2 = ler.nextDouble();
				resulta = n1 * n2;
				System.out.println("Resultado: " + resulta);
			} else if (opcao == 4) {
				System.out.println("Entre com numero 1: ");
				n1 = ler.nextDouble();
				System.out.println("Entre com o numero 2: ");
				n2 = ler.nextDouble();

				if (n2 <= 0) {
					System.out.println("Não se divide por zero!");
				} else {
					resulta = n1 / n2;
					System.out.println("Resultado: " + resulta);
				}
			} else {
				System.out.println("Opção errada!");
			}

			System.out.println("Deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		}

	}

}
