package curso.executavel;

import java.util.Scanner;

/*
 * Construa um programa que preencha três vetores com 10 posições cada. O primeiro vetor 
 * receberá os nomes de cinco funcionários; o segundo e o terceiro vetor receberão, 
 * respectivamente, o salário e o tempo de serviço de cada um. Mostre um primeiro relatório 
 * contendo apenas os nomes dos funcionários que não terão direito a aumento; mostre um 
 * segundo relatório apenas com os nomes e os novos salários dos funcionários que terão 
 * aumento. Sabe-se que os funcionários que terão direito ao aumento são aqueles que possuam 
 * tempo de serviço superior a cinco anos ou salário inferior a R$ 580,00. Sabe-se ainda que 
 * se o funcionário satisfizer as duas condições anteriores, tempo de serviço e salário, 
 * o aumento será de 35%; para o funcionário que satisfizer apenas a condição tempo de serviço,
 * o aumento será de 25%; para aquele que satisfizer apenas a condição salário, o aumento será
 * de 15%.
 * */
public class Exercicio18 {

	public static void main(String[] args) {
		// Declarando Variaveis
		int i = 5;
		String continua;
		double novoSalario[] = new double[i];
		String nomeFunc[] = new String[i];
		double salario[] = new double[i];
		float tempoServico[] = new float[i];
		String nomeAumento1[] = new String[i];
		String nomeAumento2[] = new String[i];

		Scanner ler = new Scanner(System.in);

		do {

			for (i = 0; i < 5; i++) {
				System.out.println("Digite o nome do " + i + "º funcionario: ");
				nomeFunc[i] = ler.next();
				System.out.println("Digite o salário do " + i + "º funcionario: ");
				salario[i] = ler.nextDouble();
				System.out.println("Digite o tempo de serviço do " + i + "º funcionario: ");
				tempoServico[i] = ler.nextFloat();
			}

			for (i = 0; i < 5; i++) {

				if (tempoServico[i] >= 5 || salario[i] >= 580) {

					novoSalario[i] = salario[i] + ((salario[i] * 35) / 100);
					nomeAumento1[i] = nomeFunc[i]; // vai armazenar o valor do nome do funcionario

				} else if (tempoServico[i] >= 5) {
					novoSalario[i] = salario[i] + ((salario[i] * 25) / 100);
					nomeAumento1[i] = nomeFunc[i];

				} else if (salario[i] >= 580) {
					novoSalario[i] = salario[i] + ((salario[i] * 15) / 100);
					nomeAumento1[i] = nomeFunc[i];

				} else {
					nomeAumento2[i] = nomeFunc[i];

				}
			}

			System.out.println("Nome dos Funcionarios que NÃO terão direito ao aumento.");
			for (i = 0; i < 5; i++) {
				System.out.println(nomeAumento2[i]);
			}

			System.out.println("Nome dos Funcionarios que terão direito ao aumento.");
			for (i = 0; i < 5; i++) {
				System.out.println("Nome: " + nomeAumento1[i] + " Novo Salario: " + novoSalario[i]);
			}

			System.out.println("Deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while ("S".equals(continua));

	}

}
