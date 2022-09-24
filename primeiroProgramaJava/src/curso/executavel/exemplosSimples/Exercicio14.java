package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Prepare um programa para ler 10 nomes, sexo e idade. Depois, escreva o nome de todas as 
 * mulheres com idade superior a 55 anos.
 * */
public class Exercicio14 {

	public static void main(String[] args) {
		int i, indice = 2;
		String continua;
		String nome[] = new String[indice];
		String sexo[] = new String[indice];
		int idade[] = new int[indice];

		Scanner ler = new Scanner(System.in);

		do {

			for (i = 0; i < indice; i++) {
				System.out.println("Entre com o " + i + "º valor do nome: ");
				nome[i] = ler.next();

				// Repare que tem a funçao toUpperCase para caixa alta.
				System.out.println("Entre com o " + i + "º valor do sexo (F/M): ");
				sexo[i] = ler.next().toUpperCase();

				System.out.println("Entre com o " + i + "º valor do idade: ");
				idade[i] = ler.nextInt();
			}

			for (i = 0; i < indice; i++) {
				if (idade[i] > 55 && sexo[i].equals("F"))
					System.out.println("Vetor da posição " + i + "°  Nome =" + nome[i]);

			}

			System.out.println("Deseja continuar o programa (S/N)?:");
			continua = ler.next().toUpperCase();
		} while (continua.equals("S"));

	}

}
