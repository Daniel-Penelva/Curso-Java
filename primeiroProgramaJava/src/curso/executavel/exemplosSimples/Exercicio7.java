package curso.executavel.exemplosSimples;

import java.util.Scanner;

/*
 * Elabore um programa que efetue o cálculo da quantidade de litros de combustível gasta em
 * uma viagem, utilizando um automóvel que faz 12 km por litro. Para obter o cálculo, o 
 * usuário deve fornecer o tempo gasto e a velocidade média durante a viagem. Desta forma, 
 * será possível obter a distância percorrida com a fórmula d = t * v. Tendo a distância (d), 
 * basta calcular a quantidade de litros de combustível utilizada na viagem: l = d /12. 
 * Ao final, mostre o tempo, a distância percorrida e a quantidade de litros utilizada na 
 * viagem.
 * */

public class Exercicio7 {

	public static void main(String[] args) {
		String continua;
		float tempo;
		double velocidade, distancia, litro;

		Scanner ler = new Scanner(System.in);

		do {

			System.out.println("Entre com a velocidade média durante a viagem: ");
			velocidade = ler.nextDouble();

			System.out.println("Entre com o tempo percorrido: ");
			tempo = ler.nextFloat();

			distancia = tempo * velocidade;

			litro = distancia / 12;

			System.out.println("Quantidade de litro utilizado: " + litro);
			System.out.println("Tempo de Distancia: " + tempo);
			System.out.println("Distancia percorrida: " + distancia);

			System.out.println("Você deseja continuar com o programa (S/N)? ");
			continua = ler.next().toUpperCase();
		} while ("S".equals(continua));

	}

}
