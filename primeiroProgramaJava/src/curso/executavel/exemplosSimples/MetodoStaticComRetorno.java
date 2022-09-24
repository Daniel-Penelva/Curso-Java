package curso.executavel.exemplosSimples;

import java.util.Scanner;

public class MetodoStaticComRetorno {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		// método chamando somar
		int soma = somar(num1, num2);
		System.out.println("Soma: " + soma);

		// método chamando subtrair
		int subtrai = subtrair(num1, num2);
		System.out.println("Subtração: " + subtrai);

		// método chamando multiplicar - outra maneira da saida de dados
		// float multiplica = multiplicar(num1, num2);
		System.out.println("Multiplica: " + multiplicar(num1, num2));

		// método chamando dividir
		// float dividi = dividir(num1, num2);
		System.out.println("Divisão: " + dividir(num1, num2));

	} // fim do main

	/*
	 * Lembrando que o método tem que estar sempre fora do main...
	 * 
	 * Declaração de método sem retorno static - significa que o método pertence
	 * somente a essa classe Principal.
	 * 
	 * Repare que retorna um tipo "int", logo vamos fazer uso da declaração "return"
	 * que tem como objetivo finalizar a execução do método e dentro do parâmetro
	 * são invocandos dois objetos da classe principal.
	 */

	public static int somar(int num1, int num2) {
		int soma;
		soma = num1 + num2;
		return soma;
	}

	public static int subtrair(int num1, int num2) {
		int subtrai = num1 - num2;
		return subtrai;
	}

	public static float multiplicar(int num1, int num2) {
		float multiplica = num1 * num2;
		return multiplica;
	}

	public static float dividir(int num1, int num2) {
		int dividi = num1 / num2;
		return dividi;
	}

}
