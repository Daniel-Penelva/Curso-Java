package curso.executavel;

public class OperadorTernarioSimples {

	public static void main(String[] args) {

		int n1 = 5, n2 = 8, n3 = 9;
		double media = 0;
		String resultadoMedia;

		// OBS. Ponto de interrogação "?" equivale "se for verdade então...".
		// OBS. Dois pontos ":" equivale ao senão

		// Exemplo 1
		// resultadoMedia = media >= 7 ? "Aluno Aprovado" : "Aluno Reprovado";

		// Exemplo 2
		resultadoMedia = media >= 7 ? "Aluno Aprovado"
				: (media >= 4 && media < 7) ? "Aluno em recuperação" : "Reprovado";
		System.out.println("Situação: " + resultadoMedia);
	}

}
