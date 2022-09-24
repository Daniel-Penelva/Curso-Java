package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Faça um programa para resolver uma equação do 2o grau (ax2 + bx + c = 0). As variáveis a, 
 * b e c devem ser lidas. O algoritmo deve mostrar a mensagem ("Erro! Divisão por zero!") se a
 * variável a for menor do que zero. Caso contrário, deverá mostrar uma mensagem e o(s) 
 * resultado(s) obtido(s) de acordo com a tabela a seguir.
 * 
 * discriminante = b.b – 4 * a * c
 * 
 * condição:                    mensagem             Cálculo
 *  discriminante < 0      não existe raiz real         -
 *  discriminante = 0      existe uma raiz real      x = – b / (2 * a)
 *  discriminante > 0      existem duas raizes       x = (-b + raiz da discriminante)/2*a
 *                                                   x = (-b - raiz da discriminante)/2*a
 *                                                   
 * Exemplos para entrada de dados:
 * a = 2 b = 2 c = 4
 * a = 4 b = 2 c = -6
 * a = 7 b = 3 c = 4
 * */

public class Exercicio8 {

	public static void main(String[] args) {
		String continua;
		int a, b, c;
		double discriminante, x1, x2;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Entre com a: ");
			a = ler.nextInt();
			System.out.println("Entre com b: ");
			b = ler.nextInt();
			System.out.println("Entre com c: ");
			c = ler.nextInt();

			discriminante = ((b * b) - 4 * (a * c));

			if (discriminante < 0) {
				System.out.println("Não existe raiz real de zero!");
			} else if (discriminante == 0) {
				x1 = ((-1) * b) / (2 * a);
				System.out.println("Valor de x1: " + x1);
			} else {
				// Math.sqrt = para usar a raiz quadrada
				x1 = (((-1) * b) + (Math.sqrt(discriminante))) / (2 * a);

				x2 = (((-1) * b) - (Math.sqrt(discriminante))) / (2 * a);

				System.out.println("Valor de x1: " + x1);
				System.out.println("Valor de x2: " + x2);
			}

			System.out.println("Deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();

		} while (continua.equals("S"));

	}

}
