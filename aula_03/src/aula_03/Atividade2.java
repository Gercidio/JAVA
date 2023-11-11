package aula_03;

import java.util.Scanner;

public class Atividade2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero >= 0 && (numero%2 <= 0)){
			System.out.println("O número  " +  numero + " é positivo e par!");
		}else if(numero >= 0 && (numero%2 <=1)) {
			System.out.println("O número  " +  numero + " é positivo e impar!");
		}else if(numero <= 0 && (numero%2 <= 0)) {
			System.out.println("O número  " +  numero + " é negativo e par!");
		}else if(numero <= 0 && (numero%2 <= 1)) {
			System.out.println("O número  " +  numero + " é negativo e impar!");

		}
		
	}

}
