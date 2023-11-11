package aula_03;

import java.util.Scanner;

public class Atividade4 {
	static Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String palavra1, palavra2, palavra3;
		
		//entrada de dados
		
		System.out.println("Digite a primeira palavra: ");
		palavra1 = Leia.nextLine();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = Leia.nextLine();
		System.out.println("Digite a terceira palavra: ");
		palavra3 = Leia.nextLine();
		
		//equalsignorecase para comparar as strings ignorando as
		
		if (palavra1.equalsIgnoreCase("Vertebrado")) {
			
		if(palavra2.equalsIgnoreCase("Ave")) {
		if(palavra3.equalsIgnoreCase("Carnivoro")) {
			System.out.println("Águia");
		}else {
			System.out.println("Pomba"); //condições por combinação de palavras, seg resultado é a sobra das combinações delimitadas.
		}
	}else {
		if(palavra3.equalsIgnoreCase("Herbivoro")) {
			System.out.println("Vaca");
		}else {
			System.out.println(("Homem"));
		}
	}
		}else {
			
			if(palavra2.equalsIgnoreCase("Inseto")) {
				if(palavra3.equalsIgnoreCase("Hematofago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
			}else {
				if(palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("Minhoca");
				}else {
					System.out.println("Sanguessuga");
				}
			}
		}
}
}
