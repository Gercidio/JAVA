package aula_10;

import java.util.Optional;

public class ExeOptional {

	public static void main(String[] args) {

		String[] palavras = new String[10];
		String palavra = "";
	
		//for(var p : palavras) {
		//	System.out.println(p);
		//} printa todos os objetos null
		
		//criar obj optional / evita que aparece a msg de erro newpointerexeption / pode usar em qlqr coisa que possa retornar um valor null
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]); //ofnullable qnd n tem ctz dos dados nulos
		
		//mesma coisa de != null, mas de forma mais limpa
		if (checaNulo.isPresent()) {
			palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else
			System.out.println("A palavra é nula");
	}

}
