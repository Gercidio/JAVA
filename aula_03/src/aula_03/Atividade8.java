package aula_03;

import java.util.Scanner;

public class Atividade8 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {

		float valor, saldo = 1000.00f;
		int operação;
		
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		operação = Leia.nextInt();
		
		switch(operação) {
		case 1:
			System.out.println("Saldo da conta é: " + saldo);
			break;
			
		case 2:
			System.out.println("Quanto você deseja sacar: ");
			valor = Leia.nextFloat();
			if(saldo > valor)
				System.out.println("O novo Saldo da conta está disponível: " + (saldo - valor));
			else
				System.out.println("Saldo insuficiente :(");
			break;
			
		case 3:
			System.out.println("Quanto você deseja depositar: ");
		valor = Leia.nextFloat();
		if(saldo > valor)
			System.out.println("O novo Saldo da conta está disponível: " + (saldo + valor));
			break;
	default: 
		}
		
	}

}
