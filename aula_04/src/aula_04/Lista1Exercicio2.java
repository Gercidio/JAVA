package aula_04;

import java.util.Scanner;

	public class Lista1Exercicio2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia 10 números inteiros via
		 * teclado e mostre na tela quantos números são pares e quantos número são ímpares
		 */

		int numero, contadorPar = 0, contadorImpar = 0;
		
		for(int i = 1; i <=10; i++) {
			System.out.println("Digite o número " + i + ": " );
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				contadorPar ++;
			}else {
				contadorImpar ++;
			}
		}
		
		System.out.println("Total de números pares: " + contadorPar);
		System.out.println("Total de números ímpares: " + contadorImpar);


	}

}
