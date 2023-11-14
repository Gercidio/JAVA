package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = leia.nextInt();
		
		boolean encontrado = numeros.contains(numero);
		
		if(encontrado) {
			int posicao = numeros.indexOf(numero);
			System.out.println("O número " + numero + " foi encontrado na posição " + posicao);
		}else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
			
	}

}
