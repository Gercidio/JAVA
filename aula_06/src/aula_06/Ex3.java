package aula_06;

import java.util.HashSet;
import java.util.Scanner;

public class Ex3 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero inteiro: ");
			int numero = leia.nextInt();
			
			numeros.add(numero);
		}
		System.out.println("Listar Set: ");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	

	}

}
