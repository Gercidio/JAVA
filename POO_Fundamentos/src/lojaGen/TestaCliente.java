package lojaGen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import lojaGen.Cliente;

public class TestaCliente {
	Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		
		Cliente c1 = new Cliente("Maria Leiliane", 30, 1, 2, 9.5f);
		System.out.println("Dados do cliente 1: ");
		c1.visualizar();
		Cliente c2 = new Cliente("Guilherme Góes", 35, 2, 3, 8.5f);
		System.out.println("Dados do cliente 1: ");
		c2.visualizar();
		




	}

}
