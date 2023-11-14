package aula_06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.add("Maria");
		
		System.out.println(pilha);
		
		pilha.pop(); //remove o último elemento inserido LIFO
		System.out.println(pilha);
		
		System.out.println("Elemento do topo da pilha: " + pilha.peek()); //mostra o elemento no topo da pilha
		
		System.out.println("Aline esta na pilha? " + pilha.contains("Aline")); 
		
		
	}

}
