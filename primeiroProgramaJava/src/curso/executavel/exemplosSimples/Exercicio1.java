package curso.executavel.exemplosSimples;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String numero1, numero2, continua;
		double convertenumero1, convertenumero2, resultado = 0;

		do {

			numero1 = JOptionPane.showInputDialog("Entre com a primeira nota:");
			numero2 = JOptionPane.showInputDialog("Entre com a segunda nota: ");

			convertenumero1 = Double.parseDouble(numero1);
			convertenumero2 = Double.parseDouble(numero2);

			int ler = JOptionPane.showConfirmDialog(null, "Deseja ler a média do aluno?");
			if (ler == 0) {

				resultado = (convertenumero1 + convertenumero2) / 2;
				JOptionPane.showMessageDialog(null, "Sua média: " + resultado);

				if (resultado <= 5) {
					JOptionPane.showMessageDialog(null, "Reprovado");
				} else {
					JOptionPane.showMessageDialog(null, "Aprovado");
				}
			}

			continua = JOptionPane.showInputDialog("Deseja continuar (S/N)? ").toUpperCase();

		} while (continua.equals("S"));

	}

}
