package aula_05;

import java.util.Scanner;

	public class Matrizes {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}}; //1ª, 2ª e 3ª linhas respectivamente
		
		double[][] matrizDouble = new double[3][3];
		
		
		//controlar a coluna
		for(int indiceI = 0; indiceI < matriz.length; indiceI ++ ) {
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++ ) {
				System.out.println("Matriz{" + indiceI + "][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
			
			}
		}
		//controlar linha
		System.out.println("\n");

		
		for(int indiceI = 0; indiceI < matrizDouble.length; indiceI ++ ) {
			for(int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ ++ ) {
				System.out.println("Matriz{" + indiceI + "][" + indiceJ + "] = " + matrizDouble[indiceI][indiceJ]);
				matrizDouble[indiceI][indiceJ] = leia.nextDouble();
	}
	
		}
		
		for(int indiceI = 0; indiceI < matrizDouble.length; indiceI++) {
			for(int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ ++ ) {
				System.out.println("Matriz{" + indiceI + "][" + indiceJ + "] = " + matrizDouble[indiceI][indiceJ]);
			}

		}
	}	
		
	
			
		}
	
	
