package curso.executavel.exemplosSimples;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploEntradaDeDados {

	public static void main(String[] args) {

		// Entrada de dados
		String nome = JOptionPane.showInputDialog("Entre com o seu nome: ");
		// System.out.println("Seu nome é: " + nome);

		String idade = JOptionPane.showInputDialog("Entre com a sua idade:");
		int converteIdade = Integer.parseInt(idade);
		// System.out.println("Sua idade é:" + converteIdade);

		String altura = JOptionPane.showInputDialog("Entre com a sua altura:");
		double converteAltura = Double.parseDouble(altura); 
		// System.out.println("Sua altura é: " + converteAltura); // Ex: 1.75

		// Caixa de opção de confirmação
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o formulário?");
		if (resposta == 0) {
			// Saída de dados
			JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\n" + "Sua idade é: " + converteIdade + "\n"
					+ "Sua altura é: " + converteAltura);
		}

		// divisao de dois valores - entrada de dados
		String numero1 = JOptionPane.showInputDialog("Entre com o número1: ");
		double converteNumero1 = Double.parseDouble(numero1);

		String numero2 = JOptionPane.showInputDialog("Entre com o número2: ");
		double converteNumero2 = Double.parseDouble(numero2);

		if (converteNumero2 <= 0) {
			JOptionPane.showMessageDialog(null, "Não existe divisão por zero!");
		} else {

			int divisao = (int) (converteNumero1 / converteNumero2);
			double resto = converteNumero1 % converteNumero2;

			// saída de dados
			JOptionPane.showMessageDialog(null, converteNumero1 + " / " + converteNumero2 + " = " + divisao);
			JOptionPane.showMessageDialog(null, "Resto da divisão: " + resto);
		}

		//Entrada de dados com a Classe Scanner
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o seu sobrenome:");
		String sobrenome = ler.next();
		System.out.println("Seu sobrenome é: " + sobrenome);

	}

}
