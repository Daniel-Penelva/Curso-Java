package curso.executavel.exemplosMetodoForaDaClasse;

public class CalculadoraSemRetorno {

	// Lembrando: como esta em outra classe, logo não terá o static
	
	public void somar(int num1, int num2) {
		int soma = num1 + num2;
		System.out.println("Soma: " + soma);
	}

	public void subtrair(int num1, int num2) {
		int subtrai = num1 - num2;
		System.out.println("Subtração: " + subtrai);
	}

	public void multiplicar(int num1, int num2) {
		float multiplica = num1 * num2;
		System.out.println("Multiplicação: " + multiplica);
	}

	public void dividir(int num1, int num2) {

		if (num2 <= 0)
			System.out.println("Erro!!!");
		else {
			int dividi = num1 / num2;
			System.out.println("Divisão: " + dividi);
		}

	}
}
