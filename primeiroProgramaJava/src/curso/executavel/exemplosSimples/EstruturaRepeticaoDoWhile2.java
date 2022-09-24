package curso.executavel.exemplosSimples;

import java.util.Scanner;

public class EstruturaRepeticaoDoWhile2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int opcao = 0, n1, n2, n3;
		double resulta = 0;
		String continua = null;

		do {

			System.out.println("Escolha a opção:");
			System.out.println("<1> Calcular multiplicação");
			System.out.println("<2> Calcular divisão");
			System.out.println("<3> Para ver a média de três números.");
			System.out.println("Entre com a opção: ");
			opcao = ler.nextInt();

			if (opcao == 1) {
				System.out.println("Entre com o n1? ");
				n1 = ler.nextInt();

				System.out.println("Entre com o n2? ");
				n2 = ler.nextInt();

				resulta = n1 * n2;
				System.out.println("Resultado: " + resulta);
			} else if (opcao == 2) {

				System.out.println("Entre com o n1? ");
				n1 = ler.nextInt();

				System.out.println("Entre com o n2? ");
				n2 = ler.nextInt();

				if (n2 <= 0) {

					System.out.println("Não existe divisão por zero!");

				} else {
					resulta = n1 / n2;
					System.out.println("Resultado: " + resulta);
				}
			} else if (opcao == 3) {

				System.out.println("Entre com o n1? ");
				n1 = ler.nextInt();

				System.out.println("Entre com o n2? ");
				n2 = ler.nextInt();

				System.out.println("Entre com o n3? ");
				n3 = ler.nextInt();

				resulta = (n1 + n2 + n3) / 3;
				System.out.println("Resultado: " + resulta);

			} else {
				System.out.println("Entre com a opção correta!");
			}

			System.out.println("Você deseja continuar o programa (S/N)? ");
			continua = ler.next().toUpperCase();

		} while (continua.equals("S"));

	}

}
