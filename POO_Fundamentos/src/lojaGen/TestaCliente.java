package lojaGen;

import java.util.Scanner;

public class TestaCliente {
	Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		
		Cliente c1 = new Cliente("Maria Leiliane", 30, 1, 2, 3500.00f);
		System.out.println("Dados do cliente 1: ");
		c1.visualizar();
		Cliente c2 = new Cliente("Guilherme Góes", 35, 2, 3, 4000.40f);
		System.out.println("Dados do cliente 1: ");
		c2.visualizar();
		




	}

}
