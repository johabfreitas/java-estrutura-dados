package br.com.estruturadados.main;

import br.com.estruturadados.vetores.*;
import br.com.estruturadados.modelos.Pessoa;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite a opção desejada");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		Scanner scan = new Scanner(System.in);
		int opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		}
		scan.close();
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("=======================");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("***********************");
		Pessoa p1 = new Pessoa(1, "Johab"); // Aloca um espaço na Heap
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "Johab");
		System.out.println(p2.toString());
		System.out.println("=======================");
		// p2.setNome("Treinaweb Modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

	private static void fazerVetor() {
		// índice começa com 0;
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "Treinaweb 1"));
		vetorPessoas.inserir(new Pessoa(2, "Treinaweb 2"));
		vetorPessoas.inserir(new Pessoa(3, "Treinaweb 3"));
		vetorPessoas.inserir(new Pessoa(4, "Treinaweb 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "Treinaweb 5"));
		System.out.println(vetorPessoas);
		System.out.println("Lista de pessoas: ");
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}
		/*vetorPessoas.inserirEm(0, new Pessoa(1, "Treinaweb"));
		System.out.println(vetorPessoas.recuperar(0).getNome());
		Vetor<Integer> vetorInteiros = new Vetor<Integer>(2);
		vetorInteiros.inserirEm(0, 1);
		System.out.println(vetorInteiros.recuperar(0));*/
	}
}
