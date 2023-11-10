package aula_04;

import java.util.Scanner;

public class Tabuada2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int numero, contador = 1;
		
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		/*O Laço de Repetição WHILE permite que o código seja executado repetidamente com base em uma determinada condição booleana.
		 * Ele pode ser considerado uma instrução IF de repetição.  */
		
		while (contador <= 10) {
			System.out.println(numero + "x" + contador + "=" + (numero * contador));
			contador ++;
			
		}
	}

}
