package aula_04;

import java.util.Scanner;

public class Pesquisa2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int idade, esporte, futebol = 0, voleiM18 = 0, basqueteM18 = 0, rugby = 0;
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Digite o seu esporte favorito (1-Fut / 2-Vol / 3-Basq / 4-Rugby");
				esporte = leia.nextInt();
				
				if (esporte <1 || esporte > 4)
					System.out.println("Digite um valor entre 1 e 4");
		
			} while (esporte <1 || esporte > 4);
			
			//quantas pessoas gostam de futebol
			 if (esporte == 1)
				 futebol ++;
			 //qnts pessoas gostam de volei e sao maiores de 18;
				 if (esporte ==2 && idade > 18)
					 voleiM18 ++;
			 // qnts pessoas gostam de basquete e sao menores de 18;
				 if (esporte == 3 && idade < 18)
				 basqueteM18 ++;
			 // qntas pessoas gostam de rugby
				 if (esporte == 4)
					 rugby ++;
			
				 System.out.println("Deseja continuar? (S/N)?");
				 leia.skip("\\R");
				 continua = leia.nextLine().toUpperCase();				 
			
		}
		//fora do escopo do while para nao repetir o resultado durante a entrada de dados
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de volei e são maiores que 18 anos: " + voleiM18);
		System.out.println("Total de pessoas que gostam de basquete e são menores de 18: " + basqueteM18);
		System.out.println("Total de pessoas que gostam de rugby: " + rugby);

	}

}
