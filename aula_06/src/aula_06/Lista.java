package aula_06;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

	ArrayList<Double> notas = new ArrayList<Double>(); //cria um objeto da classe ArrayList
	
	notas.add(7.0);
	notas.add(7.0);
	notas.add(6.0);
	notas.add(8.0);
	notas.add(9.0);
	notas.add(5.0);
	notas.add(3.0);
	notas.add(4.0);
	notas.add(6.0);
	notas.add(7.0);
	notas.add(9.0);


		//for(var nota : notas) //var - infere qual variavel usar
			//System.out.println(nota);
		
		notas.forEach(System.out::println); //printa as variaveis, mesma coisa da linha acima
		
		System.out.println(notas); //printa a collection em [..,..,..] 
		
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0)); //printa a posição do elemento
		System.out.println("Existe o elemento 7: " + notas.contains(7.0)); //verifica se o elemento existe T/F
		//notas.clear(); //apaga tudo
		//notas.remove(3) //remove o elemento declarado
		System.out.println("A lista está vazia? " + notas.isEmpty()); //verifica se a collect. esta vazia T/F
		
		
		
	}

}
