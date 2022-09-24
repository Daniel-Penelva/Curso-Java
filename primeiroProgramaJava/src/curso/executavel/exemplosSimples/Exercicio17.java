package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Elabore um programa que preencha um vetor com os modelos de cinco carros 
 * (exemplos de modelos: Gol, Celta, Corsa, Palio e Clio). Carregue outro vetor com o consumo 
 * desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível, 
 * calcule e mostre:
 * a. o modelo de carro mais econômico;
 * b. quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma 
 * distância de 1.000 quilômetros.
 * */
public class Exercicio17 {

	public static void main(String[] args) {
		int i;
		String modeloCarro[] = new String[5];
		double consumo[] = new double[5];
		double maior = 0, litro;
		String modelo = null;

		Scanner ler = new Scanner(System.in);

		/*
		 * OBS: Não importa como vai ser definido o indice do vetor, pode usar no mesmo
		 * for. Pode fazer o codigo do indice de três maneiras: --> modeloCarro.legth =
		 * 5 --> consumo.legth = 5 --> 5
		 * 
		 * Repare que a saida do indice vai ser sempre um numero inteiro, uma vez que o
		 * "i" é int. Não importa como vai ser definido o indice pois é na variavel
		 * (modeloCarro, consumo) que armazenam os valores de seus respectivos tipos, no
		 * caso, para o modelo de carro o tipo é String e para o consumo é o tipo
		 * double.
		 */
		for (i = 0; i < 5; i++) {
			System.out.println("Entre com a marca do " + i + "º carro: ");
			modeloCarro[i] = ler.next();

			System.out.println("Entre com o valor do " + i + "º consumo do carro: ");
			consumo[i] = ler.nextDouble();
		}

		// Letra a: foi criado duas variaveis para armzenar o maior consumo e o
		// modelo do carro.
		for (i = 0; i < 5; i++) {

			if (consumo[i] > maior) {
				maior = consumo[i];
				modelo = modeloCarro[i];
			}
		}

		// Saída da letra a
		System.out.println("Carro com maior consumo: " + modelo + ". Seu consumo: " + maior);

		// Saida da letra b
		for (i = 0; i < 5; i++) {

			/* calculo de regra de três! */
			if (consumo[i] != 0) {
				litro = (1000 * 1) / consumo[i];
				System.out.println(
						"Carro: " + modeloCarro[i] + " Seu consumo para percorrer uma distancia de 1000: " + litro);
			} else { // caso o consumo seja zero = não existe divisão por zero!!
				System.out.println("Seu consumo foi zero!!");
			}
		}

	}

}
