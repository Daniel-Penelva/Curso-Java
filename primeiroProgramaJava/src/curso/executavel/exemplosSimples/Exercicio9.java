package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia o peso de uma pessoa na Terra e o número de um planeta 
 * (de acordo com a tabela abaixo). Depois, calcule e escreva o valor do peso dessa pessoa no
 *  planeta escolhido e o nome do planeta. A relação de planetas e o valor das gravidades 
 *  relativas à Terra são:
 *  
 *  Numero    gravidade relativa   Planeta
 *  1              2,64              Jupiter
 *  2              1,17              Urano
 *  3              0,37              Mercúrio
 *  4              3,53              Netuno
 * */

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String continua = "S";
		int opcao;
		double peso = 0, pesoNovo;

		while (continua.equals("S")) {

			System.out.println("1. Jupiter");
			System.out.println("2. Urano");
			System.out.println("3. Mercúrio");
			System.out.println("4. Netuno");
			System.out.println("Entre com a opção: ");
			opcao = ler.nextInt();

			if (opcao == 1) {

				System.out.println("Entre com o seu peso: ");
				peso = ler.nextDouble();

				pesoNovo = peso * 2.64;
				System.out.println("Peso novo no planeta Jupiter: " + pesoNovo);

			} else if (opcao == 2) {
				System.out.println("Entre com o seu peso: ");
				peso = ler.nextDouble();

				pesoNovo = peso * 1.17;
				System.out.println("Peso novo no planeta Urano: " + pesoNovo);
			} else if (opcao == 3) {
				System.out.println("Entre com o seu peso: ");
				peso = ler.nextDouble();

				pesoNovo = peso * 0.37;
				System.out.println("Peso novo no planeta Mercurio: " + pesoNovo);
			} else if (opcao == 4) {
				System.out.println("Entre com o seu peso: ");
				peso = ler.nextDouble();

				pesoNovo = peso * 3.53;
				System.out.println("Peso novo no planeta Netuno: " + pesoNovo);
			} else {
				System.out.println("Entre com a opção correta!");
			}

			System.out.println("Deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		}

	}

}
