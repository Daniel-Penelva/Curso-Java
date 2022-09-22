package curso.executavel;

import java.util.Scanner;

public class ComandoSwitch {

	public static void main(String[] args) {

		int n1, n2, opcao;
		double resultado;

		Scanner ler = new Scanner(System.in);

		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("Entre com a opção: ");
		opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Entre com o valor 1: ");
			n1 = ler.nextInt();
			System.out.println("Entre com o valor 2: ");
			n2 = ler.nextInt();

			resultado = n1 + n2;
			System.out.println("Resultado: " + resultado);

			break;

		case 2:
			System.out.println("Entre com o valor 1: ");
			n1 = ler.nextInt();
			System.out.println("Entre com o valor 2: ");
			n2 = ler.nextInt();

			resultado = n1 - n2;
			System.out.println("Resultado: " + resultado);
			break;

		case 3:
			System.out.println("Entre com o valor 1: ");
			n1 = ler.nextInt();
			System.out.println("Entre com o valor 2: ");
			n2 = ler.nextInt();

			resultado = n1 * n2;
			System.out.println("Resultado: " + resultado);
			break;

		case 4:
			System.out.println("Entre com o valor 1: ");
			n1 = ler.nextInt();
			System.out.println("Entre com o valor 2: ");
			n2 = ler.nextInt();

			if (n2 <= 0) {
				System.out.println("Nao existe divisão por zero!");
			} else {
				resultado = n1 / n2;
				System.out.println("Resultado: " + resultado);
			}
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

	}

}
