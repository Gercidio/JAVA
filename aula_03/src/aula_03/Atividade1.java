package aula_03;

import java.util.Scanner;

public class Atividade1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a,b,c;
	
		
		System.out.println("Digite o valor de A:");
        a = leia.nextInt();

        System.out.println("Digite o valor de B:");
        b = leia.nextInt();

        System.out.println("Digite o valor de C:");
        c = leia.nextInt();
        
        if (a + b > c) {
            System.out.println("A soma de A + B é maior que C!");
        } else if (a + b < c) {
            System.out.println("A soma de A + B é menor que C!");
        } else {
            System.out.println("A soma de A + B é igual a C!");
        }
	}

}


