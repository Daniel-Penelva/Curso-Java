package curso.executavel.exemplosMetodoForaDaClasse;

import java.util.Scanner;

public class PrincipalSemRetorno {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		// Vamos precisar instanciar um objeto para capturar o num1 e num2...
		CalculadoraSemRetorno cal = new CalculadoraSemRetorno();

		// método chamando somar
		cal.somar(num1, num2);

		// método chamando subtrair
		cal.subtrair(num1, num2);

		// método chamando multiplicar
		cal.multiplicar(num1, num2);

		// método chamando dividir
		cal.dividir(num1, num2);
	}

}
