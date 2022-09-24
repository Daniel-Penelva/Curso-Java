package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*Faça um programa que leia a altura e o sexo de uma pessoa (1 para feminino e 2 para 
 * masculino) e que calcule e mostre o seu peso ideal, utilizando as seguintes fórmulas:
 * 
 * para homens: (72,7 * altura) – 58
 * para mulheres: (62,1 * altura) – 44,7
 * */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String continua;
		int opcao;
		double pesoIdeal, altura;

		do {

			System.out.println("<1> Para Homem");
			System.out.println("<2> Para Mulher");
			System.out.println("Escolha a opção: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				
				System.out.println("Entre com a sua altura:");
				altura = ler.nextDouble();
				
				pesoIdeal = (72.2 * altura) - 58;
				System.out.println("Seu peso: " + pesoIdeal);
			} else if (opcao == 2) {
				
				System.out.println("Entre com a sua altura:");
				altura = ler.nextDouble();
				
				pesoIdeal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso: " + pesoIdeal);
			} else {
				System.out.println("Entre com a opção correta!");
			}

			System.out.println("Vc deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while ("S".equals(continua));

	}

}
