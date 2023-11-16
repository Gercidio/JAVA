package aula_metodos;
import static aula_metodos.pacote01.Classe02.*;
public class TestaMetodos {

	public static void main(String[] args) {

		//chamadas p/ os métodos locais
		
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();
		
		//chamadas p/ métodos da classe 01
		
		Classe01.metodoPublico01(); //acesso aberto
		Classe01.metodoFriendly01();
		
		//chamadas p/ os metodos classe02 - pacote 01
		
		metodoPublico02();
		//metodoFriendly02();
	//	metodoProtegido02(); //acesso controlado
	//	metodoPrivado02(); apenas no mesmo pacote
		
	}

	public static void metodoPublico() {
		System.out.println("Método Publico");
	}
	public static void metodoFriendly() {
		System.out.println("Método Friendly");
	}
	public static void metodoProtegido() {
		System.out.println("Método Protegido");
}
	public static void metodoPrivado() {
		System.out.println("Método Privado");
	}
}

	
