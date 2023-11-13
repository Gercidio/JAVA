package aula_05;


public class Lista2Exerc3 {

	public static void main(String[] args) {

		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		int DiagonalPrincipal = 0;
        int DiagonalSecundaria = 0;
		
        for (int i = 0; i < matriz.length; i++) {  //encontrar os vetores da diagonal 1
            DiagonalPrincipal += matriz[i][i];
        }
        for (int i = 0; i < matriz.length; i++) { //encontrar os vetores da diagonal 2
            DiagonalSecundaria += matriz[i][2 - i];
        }
        
        System.out.println("Elementos da diagonal principal: ");
        for(int i = 0; i < matriz.length; i++) {
        	System.out.println(matriz[i][i]);
        }
        
        System.out.println("Elementos da diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++) {
        	System.out.println(matriz[i][2 - i]); //[2-i] para encontrar a soma dos valores da diagonal 2
	}
        System.out.println("Soma dos Elementos da Diagonal Principal: " + DiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + DiagonalPrincipal);

	}
}
