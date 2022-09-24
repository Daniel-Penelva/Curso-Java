package curso.executavel.exemplosVetor;

public class Vetor1 {

	public static void main(String[] args) {
		// não add o indice e são valores pré definidos;
		// pode fazer assim tb: int vetor[] = {4,8,5,29,1,40,31,66,7,2};
		int[] vetor = { 4, 8, 5, 29, 1, 40, 31, 66, 7, 2 };

		// ordem crescente

		for (int i = 0; i < 9; i++) {
			for (int y = i + 1; y < 10; y++) {
				if (vetor[i] > vetor[y]) {
					int auxiliar;
					auxiliar = vetor[i];
					vetor[i] = vetor[y];
					vetor[y] = auxiliar;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido!!!");
		for (int i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

	}

}
