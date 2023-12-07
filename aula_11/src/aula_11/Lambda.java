package aula_11;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Exibir dados da lista");
		numeros.forEach(n -> System.out.println(n));
	}

}
