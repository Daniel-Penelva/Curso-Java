package ListArrays;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		d1.setCodigo("cod1");
		d1.setNome("Arquitetura de Computadores");
		d1.setCreditos(100);

		Disciplina d2 = new Disciplina();
		d2.setCodigo("cod2");
		d2.setNome("Padrões de Software");
		d2.setCreditos(100);

		Disciplina d3 = new Disciplina();
		d3.setCodigo("cod3");
		d3.setNome("Banco de dados");
		d3.setCreditos(150);

		Disciplina d4 = new Disciplina();
		d4.setCodigo("cod4");
		d4.setNome("Algoritmo");
		d4.setCreditos(120);

		Disciplina d5 = new Disciplina();
		d5.setCodigo("cod5");
		d5.setNome("Programação");
		d5.setCreditos(250);

		Disciplina d6 = new Disciplina();
		d6.setCodigo("cod6");
		d6.setNome("Redes Neurais");
		d6.setCreditos(250);

		List<Disciplina> dLista = new ArrayList<Disciplina>();
		dLista.add(d1);
		dLista.add(d2);
		dLista.add(d3);
		dLista.add(d4);
		dLista.add(d5);

		// Insere o elemento especificado na posição indicada da lista.
		dLista.add(5, d6);

		System.out.println("\n");
		System.out.println("Imprimindo Lista: ");
		for (Disciplina d : dLista) {
			System.out.println("Disciplina: \n " + "Codigo: " + d.getCodigo() + " Nome: " + d.getNome() + " Crédito: "
					+ d.getCreditos());
		}

		System.out.println("\n");
		// Retorna a posição da primeira ocorrência do elemento especificado na lista.
		int posição = dLista.indexOf(d4);
		System.out.println("Posição da lista: " + posição);

		System.out.println("\n");
		// Retorna verdadeiro se a lista estiver vazia e falso caso contrário.
		boolean existeLista = dLista.isEmpty();
		System.out.println("Existe lista: " + existeLista);

		System.out.println("\n");
		// Retorna verdadeiro se a lista contém o elemento especificado e falso caso
		// contrário.
		boolean existeElemento = dLista.contains(d4);
		System.out.println("Existe o elemento na lista: " + existeElemento);

		System.out.println("\n");
		// Retorna a posição da última ocorrência do elemento especificado na lista.
		int retornaElemento = dLista.lastIndexOf(d5);
		System.out.println("Posição do último elemento especificado: " + retornaElemento);
		
		System.out.println("\n");
		// Retorna o número de elementos da lista.
		int tamanhoLista = dLista.size();
		System.out.println("Tamanho da lista: " + tamanhoLista);
		

		System.out.println("\n");
		// Removendo elementos da lista
		dLista.remove(d1);
		dLista.remove(d5);

		System.out.println("Removendo disciplina:" + "\n");
		for (Disciplina d : dLista) {
			System.out.println("Disciplina: \n " + "Codigo: " + d.getCodigo() + " Nome: " + d.getNome() + " Crédito: "
					+ d.getCreditos());
		}

		// Remove todos os elementos da lista.
		dLista.clear();

	}

}
