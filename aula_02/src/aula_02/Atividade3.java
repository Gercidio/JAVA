package aula_02;
import java.util.Scanner;

public class Atividade3 {
	static Scanner leia = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salarioBruto, adicionalNoturno, horasExtras, descontos = 200.00f, salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		System.out.printf("Salário líquido: " + salarioLiquido);
				
	}

}
