package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		fila.remove();//remove o primeiro elemento da fila, FIFO
		System.out.println(fila);
		
		fila.peek(); //mostra a fila sem remover
		System.out.println(fila);
		
		System.out.println(fila.poll());
		System.out.println(fila);
		
		System.out.println("A Maria esta na fila? " + fila.contains("Maria"));
		System.out.println("A Aline esta na fila? " + fila.contains("Aline"));
		
		System.out.println("Numero de elementos na fila " + fila.size());
		
		int contador = 0; //mostrar a posição do elemento na fila, porém p esse tipo de busca, se houver dois elementos iguais, irá retornar todos os resultados.
		for(var pessoa : fila){
			contador++;
			if(pessoa.equalsIgnoreCase("Maria"))
				System.out.println("Maria esta na posição " + contador + " da fila.");
			
				
		}
				

		
	}

}
