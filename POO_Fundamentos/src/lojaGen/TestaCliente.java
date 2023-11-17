package lojaGen;

import java.util.Scanner;
import lojaGen.Cliente;

public class TestaCliente {
	Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int opcao;
		
		Cliente c1 = new Cliente("Maria Leiliane", 30, 3, 1, 9.5f);
		System.out.println("Dados do cliente 1: ");
		c1.visualizar();
		Cliente c2 = new Cliente("Guilherme Góes", 35, 2, 3, 8.5f);
		System.out.println("Dados do cliente 1: ");
		c2.visualizar();
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}

	}

}
