package curso.executavel;

import java.util.Scanner;

public class OperadorLogico {

	public static void main(String[] args) {

		double n1, n2, n3, media;

		Scanner lerEntrada = new Scanner(System.in);

		System.out.println("Entre com a nota 1: ");
		n1 = lerEntrada.nextDouble();

		System.out.println("Entre com a nota 2: ");
		n2 = lerEntrada.nextDouble();

		System.out.println("Entre com a nota 3: ");
		n3 = lerEntrada.nextDouble();

		if (n1 < 0 || n1 >= 11) {
			System.out.println("Nota n1 com valor errado!");
		} else if (n2 < 0 || n2 >= 11) {
			System.out.println("Nota n2 com valor errado!");
		} else if (n3 < 0 || n3 >= 11) {
			System.out.println("Nota n3 com o valor errado!");
		} else {
			media = (n1 + n2 + n3) / 3;

			if (media >= 0 && media < 5) {
				System.out.println("Reprovado - sua nota: " + media);
			}
			if (media >= 5 && media < 7) {
				System.out.println("Recuperação - sua nota: " + media);
			} else {
				System.out.println("Aprovado - sua nota: " + media);
			}
		}
	}

}
