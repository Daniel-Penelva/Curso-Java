package curso.executavel;

import java.util.Scanner;

/*
 * Faça um programa que leia o código correspondente ao cargo de um funcionário e seu salário
 * atual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela 
 * abaixo:
 * 
 * codigo       cargo          percentual
 * 1        analista junior        25%
 * 2        analista senior        10%
 * 3        gerente                15%
 * 4        diretor                5%
 * 5        programador            20%
 * */

public class Exercicio {

	public static void main(String[] args) {

		double salario = 0, novoSalario, p;
		int opcao;
		String continua;
		Scanner ler = new Scanner(System.in);

		do {

			System.out.println("<1> Analista Junior");
			System.out.println("<2> Analista Sênior");
			System.out.println("<3> Gerente");
			System.out.println("<4> Diretor");
			System.out.println("<5> Programador");
			System.out.println("Entre com a opção do seu cargo:");
			opcao = ler.nextInt();

			if (opcao == 1) {
				System.out.println("Analista Junior entre com o seu salário:");
				salario = ler.nextDouble();

				novoSalario = salario + ((salario * 25) / 100);

				System.out.println("Salário Antigo: " + salario + " Novo Salario: " + novoSalario);
			} else if (opcao == 2) {
				System.out.println("Analista Sênior entre com o seu salário:");
				salario = ler.nextDouble();

				// outra maneira de fazer
				p = 10 % 100;
				novoSalario = salario + p;
				System.out.println("Salário Antigo: " + salario + " Novo Salario: " + novoSalario);
			} else if (opcao == 3) {
				System.out.println("Gerente entre com o seu salário:");
				salario = ler.nextDouble();

				novoSalario = salario + ((salario * 15) / 100);

				System.out.println("Salário Antigo: " + salario + " Novo Salario: " + novoSalario);
			}
			if (opcao == 4) {
				System.out.println("Diretor entre com o seu salário:");
				salario = ler.nextDouble();

				novoSalario = salario + ((salario * 5) / 100);

				System.out.println("Salário Antigo: " + salario + " Novo Salario: " + novoSalario);
			}
			if (opcao == 5) {
				System.out.println("Programador entre com o seu salário:");
				salario = ler.nextDouble();

				novoSalario = salario + ((salario * 20) / 100);

				System.out.println("Salário Antigo: " + salario + " Novo Salario: " + novoSalario);
			} else {
				System.out.println("Você não entrou com a opção correta!");
			}

			System.out.println("Você deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while (continua.equals("S"));
	}

}
