package curso.executavel;

public class VariavelGlobalELocal {

	// Variável Global é acessível a todos e o seu valor é compartilhado.
	static int maiorIdadeGlobal = 100;
	
	public static void main(String[] args) {
		
		// Variável local pertence somente a esse método e o valor fica dentro do método main(). 
		int idade = 10;
		System.out.println("Idade: " + idade);
		
		System.out.println("Variável global: " + maiorIdadeGlobal);
		metodoGlobal();
		
		//OBS. Tudo que for executado tem que ser dentro do método main().
	}
	
	public static void metodoGlobal() {
		System.out.println("Valor idade Global: " + maiorIdadeGlobal);
	}

}
