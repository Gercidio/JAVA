package aula_02;

import java.util.Scanner;

public class Atividade1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario, abono; 
		
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble();
		System.out.println("Digite o abono: ");
		abono = leia.nextDouble();
		
		System.out.println("Novo Salário: " + (salario+abono));
		
	}

}
