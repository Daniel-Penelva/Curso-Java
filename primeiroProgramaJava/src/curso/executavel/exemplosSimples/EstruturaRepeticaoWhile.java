package curso.executavel.exemplosSimples;

import java.util.Scanner;

public class EstruturaRepeticaoWhile {

	public static void main(String[] args) {

		// Exemplo 1
		int x = 0;

		while (x < 10) {
			System.out.println("i vale: " + x);
			x = x + 1;
		}

		// Exemplo 2
		while (x <= 10) {
			System.out.println("x: " + x);
			x++;
		}

		// Exemplo 3

		String estado, continua = "S";

		Scanner ler = new Scanner(System.in);

		while (continua.equals("S")) {

			System.out.println("Qual Estado você é na região Sudeste: ");
			System.out.println("RJ - SP - MG - ES");
			System.out.println("Qual Estado? ");
			estado = ler.next().toUpperCase();

			if (estado.equals("RJ")) {
				System.out.println("Você é carioca!");
			} else if (estado.equals("SP")) {
				System.out.println("Você é paulista!");
			} else if (estado.equals("MG")) {
				System.out.println("Você é mineiro!");
			} else if (estado.equals("ES")) {
				System.out.println("Você é capixaba!");
			} else {
				System.out.println("Você é de outro estado");
			}

			System.out.println("Deseja continuar (S/N)? ");
			continua = ler.next().toUpperCase();
		}

		System.out.println("\n");
		
		// Exercício Tabuada
		System.out.println("Digite um valor? ");
		Scanner s = new Scanner(System.in);
		int valor = s.nextInt();

		int w = 0;

		while (w <= 10) {
			System.out.println(valor + " x " + w + " = " + valor * w);
			w++;
		}

	}

}
