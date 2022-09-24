package curso.executavel.exemplosVetor;

public class Vetor7SemRetorno {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5 };

		int i;
		for (i = 0; i < vetor.length; i++) {
			System.out.println(i + "º posição: " + vetor[i]);
		}

		System.out.println("\n" + "Array Invertido");
		arrayInvertido(vetor);

	} // fim do main

	public static void arrayInvertido(int vetor[]) {

		for (int i = 5 - 1; i >= 0; i--) {
			System.out.println(i + "º posição: " + vetor[i]);
		}

	}

}
