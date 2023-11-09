package aula_03;

import java.util.Scanner;

public class Atividade4 {
	static Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite a primeira palavra: ");
		Leia.skip("\\R");
		palavra1 = Leia.nextLine();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = Leia.nextLine();
		System.out.println("Digite a terceira palavra: ");
		palavra3 = Leia.nextLine();

		if(palavra1.equalsIgnoreCase("vertebrado")) {
		
			
			if(palavra3.equalsIgnoreCase("carnívoro")) {
				if(palavra3.equalsIgnoreCase("águia")) {
			}else {
				System.out.println("pomba");
			}
				
			}else {
				if(palavra3.equalsIgnoreCase("herbívoro")) {
					System.out.println("vaca");
				}else {
					System.out.println("homem");
				}
			}
		}else {
			
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
					
			}
		} else {
			
		}
		}
	}

}
