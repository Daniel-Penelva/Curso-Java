package curso.executavel.exemplosSimples;

import java.util.Scanner;

public class MetodoStaticSemRetorno {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		/*
		 * Repare que por ser um método static não vai ser preciso instanciar um new, ou
		 * seja, um novo objeto.
		 */

		// método chamando somar
		somar(num1, num2);

		// método chamando subtrair
		subtrair(num1, num2);

		// método chamando multiplicar
		multiplicar(num1, num2);

		// método chamando dividir
		dividir(num1, num2);

	} // final do main

	/*
	 * Lembrando que o método tem que estar sempre fora do main...
	 * 
	 * Declaração de método sem retorno static - significa que o método pertence
	 * somente a essa classe Principal.
	 * 
	 * Repare que retorna um tipo "void" e dentro do parâmetro são invocandos dois
	 * objetos da classe principal.
	 */

	public static void somar(int num1, int num2) {
		int soma = num1 + num2;
		System.out.println("Soma: " + soma);
	}

	public static void subtrair(int num1, int num2) {
		int subtrai = num1 - num2;
		System.out.println("Subtração: " + subtrai);
	}

	public static void multiplicar(int num1, int num2) {
		float multiplica = num1 * num2;
		System.out.println("Multiplicação: " + multiplica);
	}

	public static void dividir(int num1, int num2) {
		int dividi = num1 / num2;
		System.out.println("Divisão: " + dividi);
	}
}
