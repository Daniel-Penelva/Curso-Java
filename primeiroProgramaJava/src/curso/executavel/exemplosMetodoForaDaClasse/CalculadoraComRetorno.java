package curso.executavel.exemplosMetodoForaDaClasse;

public class CalculadoraComRetorno {
	
	// Lembrando: como esta em outra classe, logo não terá o static
	public int somar(int num1, int num2) {
		int soma;
		soma = num1 + num2;
		return soma;
	}

	public int subtrair(int num1, int num2) {
		int subtrai = num1 - num2;
		return subtrai;
	}

	public float multiplicar(int num1, int num2) {
		float multiplica = num1 * num2;
		return multiplica;
	}

	public float dividir(int num1, int num2) {
		if (num2 <= 0) {
			return -1;
		} else {
			int dividi = num1 / num2;
			return dividi;
		}
	}
}
