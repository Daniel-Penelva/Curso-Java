package curso.executavel.exemplosSimples;

/*Indique a saída dos trechos de algoritmos apresentados a seguir. Considere os seguintes 
 * valores para as variáveis: A = 2, B = 3, C = 5 e D = 10.
 * */

public class Exercicio6 {

	public static void main(String[] args) {
		int A = 2, B = 3, C = 5, D = 10;
		int x;

		if (D <= 5) {
			x = (A + B) * D;
		} else {
			x = (A - B) / C;
		}

		System.out.println("Primeira Condição - X vale: " + x);

		if (A > 2 || B < 7) {
			x = (A + 2) * (B - 2);
		} else {
			x = (A + B) / D * (C + D);
		}

		System.out.println("Segunda Condição - X vale: " + x);

		if (A > 2 || B < 7) {
			x = (A + 2) * (B - 2);
		} else {
			x = (A + B) / D * (C + D);
		}

		System.out.println("Terceira Condição - X vale: " + x);

		if (D > 5) {
			x = A + B - 2;
		} else {
			x = A - B;
		}

		System.out.println("Quarta Condição - X vale: " + x);
	}

}
