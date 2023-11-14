package aula_06;

import java.util.HashSet;
import java.util.Scanner;

public class Ex4 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		HashSet<Integer> numeros = new HashSet<Integer>();

		
		for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
		System.out.println("Digite um numero inteiro: ");
		int numero = leia.nextInt();
		
		boolean encontrado = numeros.contains(numero);
		
		if(encontrado) {
			System.out.println("O número " + numero + " foi encontrado!");
		}else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		System.out.println("\n" + numeros);
}

}
