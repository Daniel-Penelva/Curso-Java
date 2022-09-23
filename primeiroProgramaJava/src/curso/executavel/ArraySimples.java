package curso.executavel;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySimples {

	public static void main(String[] args) {

		String[] paises = { "Brasil", "Chile", "Argentina", "Equador" };
		System.out.println("Paises: " + paises[0]);
		System.out.println("Paises: " + paises[1]);
		System.out.println("Paises: " + paises[2]);
		System.out.println("Paises: " + paises[3]);

		// substituir um valor do array
		paises[1] = "Uruguai";
		System.out.println("Array alterado: " + paises[1]);

		// Imprimir usando o for

		String[] nome = new String[4];
		nome[0] = "Daniel";
		nome[1] = "Carla";
		nome[2] = "João";
		nome[3] = "Maria";

		System.out.println("Lista crescente: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(nome[i]);
		}

		System.out.println("Lista decrescente: ");
		for (int z = 4; z >= 0; z--) {
			System.out.println(z);
		}

		// Imprimir a quantidade do array
		System.out.println("Tamanho do array:" + nome.length);

		// Imprimir lista com length

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}

		/*
		 * Classe utilizada para manipular array
		 * 
		 * metodo toString() - este método recebe um parametro
		 **/
		String carro[] = { "Ferrari", "Porsche", "Lamborguini", "Mercedes" };
		System.out.println(Arrays.toString(carro));

		// método binarySearch() - este método recorre a uma busca de referencia
		// identificando a posição
		int posição = Arrays.binarySearch(carro, "Mercedes");
		System.out.println("Posição do arrar do valor Mercedes: " + posição);

		// método sort() - este método ordena os valores na ordem crescente*/
		Arrays.sort(carro, 0, carro.length);
		System.out.println(Arrays.toString(carro));

		// método value() - este método acessa o valor do indice pre-determinado do
		// usuario*/
		Double[] numerosFracionados = { 12.90, 23.70, 2.70, 4.7 };
		System.out.println(numerosFracionados[1].doubleValue());

		/*
		 * Dados do projeto:
		 * 
		 * 1 Dimensão 2 Dimensão
		 * 
		 * Pessoas Pessoas Sexo Estado 0 - Ricardo 0 - Ricardo M RJ coluna(->) 1 -
		 * Daniel 1 - Daniel M MG 2 - Biana 2 - biana F DF 3 - Laura 3 - Laura F PA 4 -
		 * Marta 4 - Marta F SP 5 - Carlos 5 - Carlos M RJ ^ linha(|) 0 1 2
		 **/

		String[] umaDimensao = { "Ricardo", "Daniel", "Biana", "Laura", "marta", "Carlos" };
		System.out.println("Array uma dimensão: ");

		for (int w = 0; w < umaDimensao.length; w++) {
			System.out.println(umaDimensao[w]);
		}

		String[][] duasDimensao = { { "Ricardo", "M", "RJ" }, { "Daniel", "M", "MG" }, { "Biana", "F", "DF" } };

		System.out.println("Array duas dimensões: ");
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.println(duasDimensao[k][l]);
			}
		}

		/* Recuperar os dados */
		System.out.println("Acessar qualquer elemento da dimensão um: " + umaDimensao[1]);
		System.out.println("Acessar qualquer elemento \"RJ\" da dimensão dois:" + duasDimensao[0][2]);

		/* Quantidade de elementos da dimensao dois */
		System.out.println(duasDimensao.length);

		/* Quantidade de elementos da dimensao dois dentro do array interno */
		System.out.println(duasDimensao[0].length);
		
		//Estrutura de repetição com parada break
		for(int i=0; i<10; i++) {
			if(i==7) {
				System.out.println("Parei no 7!");
				break;
			}
		}
		
		//Estrutura de repetição e o continue
		for(int i=0; i<10; i++) {
			if(i==4 || i==6 || i==8) {
				System.out.println("Encontrei os números que queria: " + i);
				continue;
			}
		}
	}

}
