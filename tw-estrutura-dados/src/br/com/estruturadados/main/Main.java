package br.com.estruturadados.main;

import br.com.estruturadados.vetores.*;
import br.com.estruturadados.listasligadas.ListaLigada;
import br.com.estruturadados.modelos.Pessoa;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite a opção desejada");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista Ligada");
		Scanner scan = new Scanner(System.in);
		int opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		}
		scan.close();
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Treinaweb 1"));
		listaPessoas.inserir(new Pessoa(2, "Treinaweb 2"));
		listaPessoas.inserir(new Pessoa(3, "Treinaweb 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "Treinaweb 4"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "Treinaweb 5"));
		listaPessoas.inserirUltimo(new Pessoa(6, "Treinaweb 6"));
		System.out.println(listaPessoas.toString());
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
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Treinaweb 100");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaErrada));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaErrada));
		vetorPessoas.remover(2);
		System.out.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());
	}
}
