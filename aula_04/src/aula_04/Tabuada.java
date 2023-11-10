package aula_04;

import java.util.Scanner;

public class Tabuada {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {

		int numero, contador = 1; //O Laço de Repetição FOR é inicializado e o valor inicial é definido (variável inteira);
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		/*A condição limite é testada;
		*Se a Condição for verdadeira, o fluxo vai para o corpo do laço de repetição;
		*Se a Condição for falsa, o fluxo sai do laço.*/
		
		for (contador = 1; contador <= 10; contador++) { 
            System.out.println(numero + " x " + contador + " = " + numero * contador);  
            
            /*Na sequência, o fluxo vai para a etapa 3, testa a condição e repete o fluxo caso a condição seja verdadeira;
            Caso a condição seja falsa, o Laço de Repetição FOR é finalizado e o fluxo sai do laço.
            */
         
        }
	}

}
