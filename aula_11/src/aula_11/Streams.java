package aula_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<String> cidades = Arrays.asList("São Paulo", "Pindamonhongaba", "Pereira Barreto", "São Vicente", "Praia Grande", "Rio de Janeiro");
		List<String> cidades2 = Arrays.asList("São Paulo", "Pindamonhongaba","São Paulo","São Paulo","São Paulo","São Paulo", "Pereira Barreto", "São Vicente", "Praia Grande", "Rio de Janeiro");

		List<Integer> numerosAoCubo = numeros.stream()
				.map(n-> n*n*n)
				.collect(Collectors.toList());
		
		System.out.println(numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n-> n%2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(numerosPares);
		
		long cidadesInicialP = cidades.stream()
				.filter(c -> c.toString().startsWith("P"))
				.count();
			System.out.println("Cidades iniciando com letra P: " + cidadesInicialP);
			
		List<String> cidadesSemRepeticao = cidades2.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(cidadesSemRepeticao);
		
	}

}
