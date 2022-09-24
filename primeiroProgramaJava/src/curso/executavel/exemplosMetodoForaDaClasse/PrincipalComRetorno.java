package curso.executavel.exemplosMetodoForaDaClasse;

import java.util.Scanner;

public class PrincipalComRetorno {

	public static void main(String[] args) {

		int num1, num2;
		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o valor do numero 1 ?");
		num1 = s.nextInt();
		System.out.println("Entre com o valor do numero 2 ?");
		num2 = s.nextInt();

		// Vamos precisar instanciar um objeto para pegar o num1 e num2...
		CalculadoraComRetorno cal = new CalculadoraComRetorno();

		// método chamando somar
		int soma = cal.somar(num1, num2);
		System.out.println("Soma: " + soma);

		// método chamando subtrair - imprimindo de outro jeito
		System.out.println("Subtração:" + cal.subtrair(num1, num2));

		// método chamando multiplicar - pegando com outra variavel
		float valor_multiplica = cal.multiplicar(num1, num2);
		System.out.println("Multiplicação: " + valor_multiplica);

		// método chamando dividir
		System.out.println(cal.dividir(num1, num2));
	}

}
