package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Ex02Atv08 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();


		while(true) {
			System.out.println("Menu: ");
			System.out.println("1: Adicionar um novo livro na pilha: ");
			System.out.println("2: Listar todos os livros da Pilha: ");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair do menu.");
			
			int opcao = leia.nextInt();
		
		
			switch(opcao) {
			case 1: System.out.println("Digite o nome: ");
				pilha.add(leia.nextLine());
				System.out.println("\nLivro adicionado!");
				System.out.println(pilha);
				break;
				
			case 2: System.out.println("Lista de livros na pilha: ");
			for(var livro : pilha) {
				System.out.println(livro);
			}
			break;
			
			case 3: String livro = pilha.pop();
			if(livro == null) {
				System.out.println("A pilha esta vazia!");
			}else {
				System.out.println("Um livro foi retirado da pilha!");
				System.out.println(pilha);
			}
			break;
			
			case 0: System.out.println("Programa finalizado!");
			return;
				default: System.out.println("Opção inválida!");
			}
			
		}
	}

}
