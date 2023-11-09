package aula_03;
//ctrl+shift+O importa automaticamente.
import java.util.Scanner;

public class PlanoSaude {
	static Scanner leia = new Scanner(System.in); //entrada de dados a partir do teclado
	public static void main(String[] args) {

		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		//estabelecer primeira condição.
		
		if(idade > 0 && idade <= 10) {
			System.out.printf("%s o seu Plano de Saúde custará R$ 100,00 por mês", nome);
		}else if(idade >= 11 && idade <= 29) {
			System.out.printf("%s o seu Plano de Saúde custará R$ 200,00 por mês", nome);
			
			//estabelecer condições encadeadas.
			
		}else if(idade >= 30 && idade <= 45) {
			System.out.printf("%s o seu Plano de Saúde custará R$ 300,00 por mês", nome);
	}else if(idade >= 46 && idade <= 59) {
		System.out.printf("%s o seu Plano de Saúde custará R$ 500,00 por mês", nome);
	}else if(idade >= 60 && idade <= 65) {
		System.out.printf("%s o seu Plano de Saúde custará R$ 600,00 por mês", nome);
	}else {			//última condição caso as anteriores não sejam satisfeitas.
		System.out.printf ("%s o seu Plano de Saúde custará R$ 1000,00 por mês", nome);
	}
	}
}

