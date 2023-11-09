package aula_03;

import java.util.Scanner;

public class Atividade3 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		//declaração das variáveis
		String nomeDoador;
		int idade;
		boolean primeiraDoação;
		
		//entrada de dados
		System.out.println("Digite seu nome: ");
		nomeDoador = leia.nextLine();
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();	
		System.out.println("Primeira doação de sangue: (true/false)");
		primeiraDoação = leia.nextBoolean();
		
		//condições
		if(idade < 18 || idade > 69) {
			System.out.println(nomeDoador + " não está apto para doar sangue!");
		}
			else if(idade >= 60 && idade <=69 && primeiraDoação == true) {
				System.out.println(nomeDoador +" não está apto para doar sangue!");
		}else if (idade >= 18 && idade <= 59 && primeiraDoação == true) {
			System.out.println(nomeDoador +" está apto para doar sangue!");
		}else if(idade >= 18 && idade <= 69 && primeiraDoação == false) {
			System.out.println(nomeDoador +" está apto para doar sangue!");
		}
	}

}
