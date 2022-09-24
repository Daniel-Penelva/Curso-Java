package curso.executavel.exemplosSimples;

import java.io.IOException;
import java.util.Scanner;

public class ManipulandoString {

	public static void main(String[] args) {

		char letra;
		System.out.println("Entre com um caracter? ");

		/*
		 * Neste caso como não esta sendo instanciado um objeto com a classe Scanner vai
		 * ser preciso ter um tratamento de exceção, pois irá tratar o erro do usuario
		 * que digitar mais de uma letra
		 */
		try {
			letra = (char) System.in.read();
			System.out.println("O caracter escolhida é: " + letra);
		} catch (IOException e) {
			e.getStackTrace();
		}

		/*
		 * =============================================================================
		 */

		String palavra;

		Scanner s = new Scanner(System.in);

		System.out.println("Digite uma palavra? ");
		palavra = s.next();

		System.out.println("A palavra é " + palavra);
	}

}
