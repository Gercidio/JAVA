package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Atv08 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		while(true) {
			System.out.println("Menu: ");
			System.out.println("1: Adicionar um novo Cliente na fila.");
			System.out.println("2: Listar todos os Clientes na fila.");
			System.out.println("3: Chamar uma pessoa da fila");
			System.out.println("0: Sair do menu.");
			
			int opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: System.out.println("Digite o nome: ");
				fila.add(leia.nextLine());
				break;
				
			case 2: System.out.println("Lista de clientes na fila: ");
			for(var cliente : fila) {
				System.out.println(cliente);
			}
			break;
			
			case 3: String cliente = fila.poll();
			if(cliente == null) {
				System.out.println("A fila esta vazia!");
			}else {
				System.out.println("O cliente " + cliente + " foi chamado!");
				System.out.println(fila);
			}
			break;
			
			case 0: System.out.println("Programa finalizado!");
			return;
				default: System.out.println("Opção inválida!");
			}
			
		}
	}

}
