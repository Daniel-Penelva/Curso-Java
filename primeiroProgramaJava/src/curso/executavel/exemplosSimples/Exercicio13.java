package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Prepare um programa para ler separadamente dois vetores de 10 números. 
 * Calcule a soma destes dois vetores, gerando um terceiro.
 * */
public class Exercicio13 {

	public static void main(String[] args) {
		int i;

		int vetorX[] = new int[5];
		int vetorY[] = new int[5];
		int soma[] = new int[5];

		// Iniciar o while. Variavel continua com valor constante.
		String continua = "S";

		Scanner ler = new Scanner(System.in);

		while (continua.equals("S")) {
			System.out.println("Vetor X ");
			for (i = 0; i < vetorX.length; i++) {
				System.out.println("Entre com o " + i + "º valor do vetor X: ");
				vetorX[i] = ler.nextInt();
			}

			System.out.println("Vetor Y ");
			for (i = 0; i < vetorY.length; i++) {
				System.out.println("Entre com o " + i + "º valor do vetor Y: ");
				vetorY[i] = ler.nextInt();
			}

			// OBS: Neste caso não importa qual vetor pegar para representar o
			// indice. Qlq deles o indice é igual a 5.
			for (i = 0; i < vetorX.length; i++) {
				soma[i] = vetorX[i] + vetorY[i];
			}

			// Repare que eu inseri até o valor 5 o i. Podendo ser assim tb:
			// vetorX.length
			for (i = 0; i < 5; i++) {
				System.out.println("Vetor da posição " + i + "º valor do vetor: " + soma[i]);
			}

			System.out.println("Deseja continuar o programa (S/N)?:");
			continua = ler.next().toUpperCase();
		}

	}

}
