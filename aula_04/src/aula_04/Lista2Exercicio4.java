package aula_04;

import java.util.Scanner;

public class Lista2Exercicio4 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:

		int idade, genero, dev, back = 0, front = 0, mobile = 0, full = 0, outros = 0;
		float media = 0.0f, somaIdade = 0.0f; 
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Digite a identidade de genero: (1-MC / 2-HC / 3-NB / 4-MT / 5-HT / 6-Outros: ");
				genero = leia.nextInt();
				
				if(genero <1 || genero > 6)
					System.out.println("Digite um valor entre 1 e 6");
			}while(genero < 1 || genero > 6);
			
			do {
				System.out.println("Digite a categoria da Pessoa Desenvolvedora (1-Back / 2- Front / 3-Mob / 4-Full");
				dev = leia.nextInt();
				
				if (dev < 1 || dev > 4)
					System.out.println("Digite um valor entre 1 e 4");

			}while (dev < 1 || dev > 4);
			
			if(dev == 1)
				back ++;
			if(dev == 2 && (genero == 1 || genero == 4))
				front ++;
			if (dev == 3 && (genero ==2 || genero == 5) && idade > 40)
				mobile ++;
			
		}
		

	}

}
