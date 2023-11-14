package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {

		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		//frutas.add(null); //aceita elementos nulos, uma vez.
		
		System.out.println(frutas);
		
	//	for(var fruta : frutas)
		//	System.out.println(fruta.hashCode()); //printa os hashcodes de todos os elementos, sequencia de numeros q define a ordenação dos elementos, descartando os repetidos.
		
		System.out.println("A fruta morango existe: " + frutas.contains("Morango")); //retorna T/F sem posição

		Iterator<String> iFrutas = frutas.iterator(); //faz uma "cópia" da collection, sem modificar a original e permite atualizar depois das alterações
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		ArrayList<String> frutasList = new ArrayList<String>();
		//criar um array string, add os elementos da collect. hashset no arraylist
		frutasList.addAll(0, frutas);
		frutasList.sort(null); //ordena a lista em ordem crescente
		System.out.println(frutasList);
		frutasList.sort(Comparator.reverseOrder()); //ordenar em ordem descrescente, apenas se a lista estiver em ordem crescente
		System.out.println(frutasList);
		
		
	}

}
