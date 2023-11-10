package aula_04;

import java.util.Scanner;

public class Lista3Exercicio5 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.*/
		
		int numero, soma = 0;
		
		//leitura dos numeros inteiros
		do {
			System.out.print("Digite um número inteiro: ");
            numero = leia.nextInt();
            if (numero > 0) {
                soma += numero;
            }
		} while (numero != 0);  //condição para que o programa seja encerrado qnd digitamos 0
		
		System.out.println("A soma dos números positivos é: " + soma);
		
	}

}
