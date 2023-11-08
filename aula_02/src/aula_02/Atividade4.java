package aula_02;
import java.util.Scanner;

public class Atividade4 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float numero1, numero2, numero3, numero4, resultado;
		
		System.out.println("Digite o 1º numero");
		numero1 = leia.nextFloat();
		System.out.println("Digite o 2º numero");
		numero2 = leia.nextFloat();
		System.out.println("Digite o 3º numero");
		numero3 = leia.nextFloat();
		System.out.println("Digite o 4º numero");
		numero4 = leia.nextFloat();

		resultado = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("Diferença igual a: " + resultado);
		
	}

}
