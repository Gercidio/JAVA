package aula_04;

import java.util.Scanner;

public class Lista2Exercicio4 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:

		int idade, genero, dev, back = 0, front = 0, mobile = 0, full = 0, total = 0;
		float media = 0.0f, somaIdade = 0.0f; 
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
				System.out.println("Digite a identidade de genero: (1-MC / 2-HC / 3-NB / 4-MT / 5-HT / 6-Outros: "); //"menu"
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
			
			if(dev == 1) //número de pessoas desenvolvedoras Backend
				back ++;
			
			if(dev == 2 && (genero == 1 || genero == 4)) //número de Mulheres Cis e Trans desenvolvedoras Frontend
				front ++;
			
			if (dev == 3 && (genero ==2 || genero == 5) && idade > 40) // Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
				mobile ++;
			
			if(dev == 4 && (genero == 3 && idade < 30)) //número de Não Binários desenvolvedores FullStack menores de 30 anos
				full ++;
			
			total ++; //otal de pessoas que responderam à pesquisa
			somaIdade += idade;
			media = somaIdade / total; //média de idade das pessoas que responderam à pesquisa
			
			System.out.println("Deseja continuar (S/N): ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + front);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de Não Binários desenvolvedores FullStack menores de 30 anos: " + full);
		System.out.println("Total de pessoas que responderam à pesquisa: " + total);
		System.out.println("Média de idade das pessoas que responderam à pesquisa: " + media);


	}

}
