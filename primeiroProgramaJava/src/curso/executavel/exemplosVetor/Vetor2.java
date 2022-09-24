package curso.executavel.exemplosVetor;

public class Vetor2 {

	public static void main(String[] args) {
		// repare como é feito essas declarações, as duas estão corretas
		// int vetor[] = new int[10];
		int[] vetor = new int[10];

		vetor[0] = 32;
		vetor[1] = 90;
		vetor[2] = 1;
		vetor[3] = 10;
		vetor[4] = 4;
		vetor[5] = 9;
		vetor[6] = 18;
		vetor[7] = 101;
		vetor[8] = 91;
		vetor[9] = 8;

		// ordem crescente

		int i, y, auxiliar;

		for (i = 0; i < 9; i++) {
			for (y = i + 1; y < 10; y++) {
				if (vetor[i] > vetor[y]) {
					auxiliar = vetor[i];
					vetor[i] = vetor[y];
					vetor[y] = auxiliar;
				}
			}
		}

		for (i = 0; i < 10; i++) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido");
		for (i = 10 - 1; i >= 0; i--) {
			System.out.println(i + 1 + "º vetor = " + vetor[i]);
		}

	}

}
