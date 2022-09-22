package curso.executavel;

import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {

		/* OBS.
		 * O bloco de instrução do iterador do-while será executado e somente após a
		 * execução, a condição contida na instrução WHILE será verificada.
		 */
		
		// Exemplo 1

		int x = 1;
		do {
			System.out.println("x: " + x);
			x++;
		} while (x <= 10);

		// Exemplo 2
		
		
		String continua;
		int n1, n2;
		double soma=0, subtracao=0, multiplicacao=0, divisao=0;
		
		do {
			
		    Scanner ler = new Scanner(System.in);
		    System.out.println("Entre com o n1: ");
		    n1 = ler.nextInt();
		    
		    System.out.println("Entre com o n2: ");
		    n2 = ler.nextInt();
		     
		    soma = n1+n2;
		    System.out.println("Resultado: " + n1 + " + " + n2 + "= " + soma);
		    
		    subtracao = n1-n2;
		    System.out.println("Resultado: " + n1 + " - " + n2 + "= " + subtracao);
		    
		    multiplicacao = n1*n2;
		    System.out.println("Resultado: " + n1 + " * " + n2 + "= " + multiplicacao);
		    
		    if(n2 <= 0) {
		    	System.out.println("Não divide por zero!");
		    }else {
		    	divisao = n1/n2;
		    	System.out.println("Resultado: " + n1 + " / " + n2 + "= " + divisao);
		    }
		    
			System.out.println("Deseja continuar o programa (S/N) ?");
			continua = ler.next().toUpperCase();
			
		} while (continua.equals("S"));
	}
}
