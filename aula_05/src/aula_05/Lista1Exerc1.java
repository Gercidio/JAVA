package aula_05;

import java.util.Scanner;

public class Lista1Exerc1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] numeroInt = {12,54,23,234,87,6,7,8,9,10};
		int numero;
		
		for(int indice = 0; indice < numeroInt.length; indice++) {
		System.out.println("Pesquise um número: ");
		numero = leia.nextInt();

		int posicao = -1;
		for(int i = 0; i < numeroInt.length; i++) {
			if(numeroInt[i] == numero) {
				posicao = i;
				break;
			}
		}
		if(posicao!= -1) {
			System.out.println("O numero " + numero + " foi encontrado na posição " + posicao);
			break;
		}else {
			System.out.println("O numero " + numero + " não foi encontrado!");
			break;
		}
		
		}
	}

}
