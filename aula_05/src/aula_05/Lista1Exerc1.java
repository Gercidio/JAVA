package aula_05;

import java.util.Scanner;

public class Lista1Exerc1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] numeroInt = {12,54,23,234,87,6,7,8,9,10}; //vetor
		int numero, posicao = -1; //variaveis para saber o numero pesquisado e a posição
		
			
		System.out.println("Pesquise um número: ");
		numero = leia.nextInt();

		for(int i = 0; i < numeroInt.length; i++) { //se o numero digitado for igual ao encontrado, armazena na posição i e retorna o valor no final
			if(numeroInt[i] == numero) {
				posicao = i;
				break;
			
		}
		if(posicao!= -1) {
			System.out.println("O numero " + numero + " foi encontrado na posição " + posicao);
			
		}else {
			System.out.println("O numero " + numero + " não foi encontrado!"); //caso nao seja encontrado, exibe a msg
			
		}
		
		}
	}

}
