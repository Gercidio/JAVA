package aula_04;

import java.util.Scanner;

public class Lista1Exercicio1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
		 * onde o primeiro número deve ser menor do que o segundo número. Caso contrário, 
		 * deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
			No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. */
		

		int a, b;
	
		System.out.println("Digite o primeiro número do intervalo: ");
		a = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		b = leia.nextInt();
		
		if(a > b) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.printf("No Intervalo entre %d e %d:\n\n", a, b);
			for(int i = a; i <= b; i+=5) {
				if(i % 3 == 0 && i % 5 ==0) {
					System.out.printf("%d é multiplo de 3 e 5\n", i);
				}
			}
	}
	}
	}
