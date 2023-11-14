package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Atv08 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		while(true) {
			System.out.println("********************************************");
			System.out.println("\nMenu: ");
			System.out.println("1: Adicionar um novo Cliente na fila.");
			System.out.println("2: Listar todos os Clientes na fila.");
			System.out.println("3: Chamar uma pessoa da fila");
			System.out.println("0: Sair do menu.");
			System.out.println("\n********************************************");

			
			opcao = leia.nextInt();
			
			
			switch(opcao) {
			case 1: System.out.println("Digite o nome: ");
				fila.add(leia.next());
				System.out.println(fila);
				System.out.println("Cliente adicionado");
				break;
				
			case 2: System.out.println("Lista de clientes na fila: ");
			for(var cliente : fila) {
				System.out.println(cliente);
			}
			break;
			
			case 3: 
			if(fila.isEmpty()) {
				System.out.println("A fila esta vazia!");
			}else {
				System.out.println("O cliente foi chamado! 3" + fila.poll());
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

/*anotações da correção
 * professor começou colocando o 0 no começo com condiconal if e usando o System.exit(0) para sair do programa
 * case 1: criou uma var String nome para armazenar e ler e depois fez o fila.add(nome)
 * case 2: Iterator<String> iFila = fila.iterator(); 
 * while(iFila.hasNext() / sysout(Ifila.next()); poderia usar o método ForEach tbm
 * case 3: fila.remove para apenas remover, sem mostrar
 * 
 * */
