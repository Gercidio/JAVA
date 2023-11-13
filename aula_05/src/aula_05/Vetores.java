package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		String[] pessoas = {"Luiza", "Gercidio", "Rafael", "Tati", "Vinicius", "Samara"};
		float[] notas = new float[5];
		
		for(int indice = 0; indice < 6; indice ++) //sem { } pq tem apenas um comando/ação
		System.out.println("Posição  " + (indice + 1) + " = " + pessoas[indice]); //(indice + 1) para printar o 1 como posição inicial
	
		System.out.println("\n");
		
		//for(int indice = 0; indice < pessoas.length; indice ++) { //escopo principal, para rodar a pt inferior colocar como - //
		//	System.out.println("Posição  " + indice + " = ");
		//	notas[indice] = leia.nextFloat();	
		
	//}
		
	for(int indice = 0; indice < notas.length; indice ++) // nomeVetor.length para mostrar apenas o que esta dentro do tamanho do vetor
		System.out.println("Posição" + indice + " = " + notas[indice]);
	
		Arrays.sort(pessoas); //ordena conforme a condição declarada
		for(int indice = pessoas.length - 1; indice >= 0 ; indice --) //ordem crescente, o inverso +1, ++, = 0, realiza a ordem crescente
			System.out.println("Posição  [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("Localize o elemento da posição 02: " + Arrays.binarySearch(pessoas, "Luiza"));  //procurar a posição do elemento no vetor
	
		for(int indice = 0; indice < pessoas.length; indice ++) {
			if(pessoas[indice].equalsIgnoreCase("Luiza"))
				System.out.println("\nLuiza esta na posição: " + indice);
		}
		for(String pessoa : pessoas) {
			System.out.println(pessoa); //simplificação do loop for, só funciona com vetores,matrizes etc
		}
	}
	
	

	
}
 