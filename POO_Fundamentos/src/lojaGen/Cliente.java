package lojaGen;

public class Cliente {
	
	//atributos cliente
	 private String nome;
	 private int idade;
	 private int escolaridade;
	 private int linguagem;
	 private float notas;
	 
	 
	public Cliente(String nome, int idade, int escolaridade, int linguagem, float saldo, float notas) {
		this.nome = nome;
		this.idade = idade;
		this.escolaridade = escolaridade;
		this.linguagem = linguagem;
		this.notas = notas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getEscolaridade() {
		return escolaridade;
	}


	public void setEscolaridade(int escolaridade) {
		this.escolaridade = escolaridade;
	}


	public int getLinguagem() {
		return linguagem;
	}


	public void setLinguagem(int linguagem) {
		this.linguagem = linguagem;
	}


	public float getSaldo() {
		return notas;
	}


	public void setSaldo(float saldo) {
		this.notas = saldo;
	}
		 
	//métodos auxiliares
	public void visualizar() {
		System.out.println("------------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Escolaridade" + escolaridade);
		System.out.println("Linguagem: " + linguagem);
		System.out.println("Notas: " + notas);
		System.out.println("------------------------------------------");

		
	}
		 
		 
	}


