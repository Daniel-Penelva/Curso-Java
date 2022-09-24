package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Escrever um programa para corrigir provas de múltipla escolha. Cada prova tem 10 questões, 
 * cada questão valendo um ponto. O primeiro conjunto de dados a ser lido será o gabarito para 
 * a correção da prova. Os outros dados são os números dos alunos e suas respectivas respostas 
 * e o último número será 9999. O programa deverá calcular e escrever: a) para cada aluno, o 
 * seu número e sua nota; b) a porcentagem de aprovação, sabendo-se que a nota mínima exigida 
 * de aprovação é 6.0; c) a nota que teve a maior frequência absoluta, ou seja, a nota que 
 * aparece maior número de vezes (supondo a inexistência de empates). 
 * Obs.: 3 vetores: gabarito, respostas e frequencia.
 * */
public class Exercicio16 {

	public static void main(String[] args) {

		// Declarando variáveis
		int i, numAluno = 0, respCerta = 0, totalNota = 0, maiorNota = 0;
		double frequencia, aprovado = 0, maior = 0;
		double porcentagem;
		String respostaAluno[] = new String[5];

		// Desenvolvimento do programa

		Scanner ler = new Scanner(System.in);

		System.out.println("Resultado do Gabarito: ");
		// Declarando o vetor do gabarito
		String gabarito[] = { "A", "D", "C", "A", "B" };
		for (i = 0; i < gabarito.length; i++) {

			System.out.println(gabarito[i]);
		}

		// Enquanto o aluno for diferente de zero vai adicionando mais alunos.
		System.out.println("Digite o número do aluno (OBS: zero termina o programa!) : ");
		numAluno = ler.nextInt();

		// Frequencia do aluno
		System.out.println("Digite a frequencia do aluno: ");
		frequencia = ler.nextInt();

		while (numAluno != 0) {

			for (i = 0; i < respostaAluno.length; i++) {
				System.out.println("Entre com  " + i + "º resposta da prova (A,B,C,D,E):");
				respostaAluno[i] = ler.next().toUpperCase();
			}

			for (i = 0; i < gabarito.length; i++) {

				if (gabarito[i].equals(respostaAluno[i]))
					respCerta++; // contabilizador da resposta certa;
			}

			// Obs: Cada acerto de questão vale dois pontos para totatilzar 10.
			totalNota = respCerta * 2;

			System.out.println("Seu número é: " + numAluno + " Sua nota é: " + totalNota);

			// Porcentagem da aprovação
			if (totalNota >= 6) {
				aprovado++; // contabilizador de aprovação;
			}

			// vai verificar quais dos alunos tem mais frequencia e a maior nota
			if (frequencia > maior) {
				maior = frequencia;
				maiorNota = totalNota;
			}

			// Enquanto o aluno for diferente de zero vai adicionando mais
			// alunos.
			System.out.println("Digite o número do aluno (OBS: zero termina o programa!) : ");
			numAluno = ler.nextInt();

			// Frequencia do aluno
			if(numAluno == 0) {
				System.out.println("Sair do sistema!");
			}else {
			System.out.println("Digite a frequencia do aluno: ");
			frequencia = ler.nextInt();
			}

		} // fim while

		// Porcentagem de aprovação
		porcentagem = aprovado / 100;
		if (aprovado == 0) {
			System.out.println("Não houve aprovados.");
		} else {
			System.out.println("Porcentagem de Aprovação: " + aprovado);
		}

		System.out.println("Frequencia: " + maior + " Maior nota: " + totalNota);

	}
	// OBS: A saida da nota está errada, a partir do segundo cadastro do aluno
	// faz um somatorio com o primeiro aluno e sucessivamente.
}
