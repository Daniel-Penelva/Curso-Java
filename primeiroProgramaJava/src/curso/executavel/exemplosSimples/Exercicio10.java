package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*Faça um algoritmo que apresente o menu de opções a seguir, permita ao usuário escolher a
 * opção desejada, leia os dados necessários para executar a operação e escreva o resultado.

 Menu de Opções
 1. Imposto
 2. Novo Salário
 3. Classificação

 Digite a opção:
 Na opção 1: ler o salário de um funcionário, calcular e mostrar o valor do imposto usando as 
 regras abaixo:

 Salario                   imposto %
 menor e igual a 500          5
 de 500 a 850 (inclusive)     10
 acima de 850                 15

 Na opção 2: ler o salário de um funcionário, calcular e mostrar o valor do novo salário 
 usando a tabela a seguir:

 Salarios                     aumento R$
 maiores que 1500               25
 de 750(inclusive) a 1500       50
 de 450 a 750(inclusive)        75
 menores que 450                100

 Na opção 3: ler o salário de um funcionário e mostrar sua classificação usando a tabela 
 abaixo:

 Salario               classificação
 até 700 (inclusive)      mal remunerado
 maiores de 700           bem remunerado
 * 
 * */

public class Exercicio10 {

	public static void main(String[] args) {
		int opcao;
		double salario, novoSalario;
		String continua;
		Scanner ler = new Scanner(System.in);

		do {

			System.out.println("1. Imposto");
			System.out.println("2. Novo Salario");
			System.out.println("3. Classificação");
			System.out.println("Entre com a opção: ");
			opcao = ler.nextInt();

			System.out.println("Entre com o salário do Funcionário? ");
			salario = ler.nextDouble();

			switch (opcao) {
			case 1:

				if (salario <= 500) {

					novoSalario = salario - ((salario * 5) / 100);
					System.out.println("Novo Salario: " + novoSalario);
				} else if (salario > 500 && salario <= 850) {
					novoSalario = salario - ((salario * 10) / 100);
					System.out.println("Novo Salario: " + novoSalario);
				} else {
					novoSalario = salario - ((salario * 15) / 100);
					System.out.println("Novo Salario: " + novoSalario);
				}

				break;

			case 2:
				if (salario >= 1500) {
					novoSalario = salario + 25;

					System.out.println("Novo Salario: " + novoSalario);
				} else if (salario < 1500 && salario >= 750) {
					novoSalario = salario + 50;
					System.out.println("Novo Salario: " + novoSalario);
				} else if (salario < 750 && salario >= 450) {
					novoSalario = salario + 75;
					System.out.println("Novo Salario: " + novoSalario);
				} else {
					novoSalario = salario + 100;
					System.out.println("Novo Salario: " + novoSalario);
				}
				break;

			case 3:
				if (salario >= 700) {
					System.out.println("Bem Remunerado");
				} else {
					System.out.println("Mal Remunerado");
				}
				break;

			default:
				System.out.println("Entre com a opção correta!");
				break;
			}

			System.out.println("Deseja Continuar com o programa (S/N): ");
			continua = ler.next().toUpperCase();
		} while (continua.equals("S"));

	}

}
