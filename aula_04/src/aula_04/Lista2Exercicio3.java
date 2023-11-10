package aula_04;

import java.util.Scanner;

public class Lista2Exercicio3 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int idade = 0, menor21 = 0, maior50 = 0;
		
		
		//total de pessoas cuja idade seja menor que 21 anos
		// total de pessoas cuja idade seja maior que 50 anos
		// A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		
		while(idade < 0) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			 
			 if (idade < 21) {
				 menor21 ++;
				 
			 } else if (maior50 > 50) {
				 maior50 ++;
			 }
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50: " + maior50);
	}

}
