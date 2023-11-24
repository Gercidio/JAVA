package lojaGen;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
	
	//atributos cliente
	 private String nome;
	 private int idade;
	 private int escolaridade; //1 - EM, 2 - Superior incompleto, 3 - superior com.
	 private int linguagem; // 1 - java, 2 - JS, 3 - Python
	 private float saldo;
	 
	 
	public Cliente(String nome, int idade, int escolaridade, int linguagem, float saldo) {
		this.nome = nome;
		this.idade = idade;
		this.escolaridade = escolaridade;
		this.linguagem = linguagem;
		this.saldo = saldo;
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
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
		 
	//métodos auxiliares
	public void visualizar() {
		System.out.println("------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Escolaridade: " + escolaridadeToString(this.escolaridade));
		System.out.println("Linguagem: " + linguagemToString(this.linguagem));
		System.out.println("Saldo da sua carteira digital: " + this.saldo);
		System.out.println("------------------------------------------");

		
	}


	private String linguagemToString(int linguagem2) {
		switch(linguagem) {
		case 1: 
			return "JAVA";
		case 2: 
			return "Java Script";
		case 3: 
			return "Python";
			default:
				return "Indefinido";
		}
		
	}


	private String escolaridadeToString(int escolaridade2) {
		    switch (escolaridade) {
		      case 1:
		        return "Ensino Médio";
		      case 2:
		        return "Superior Incompleto";
		      case 3:
		    	  return "Superior Completo";
		      default:
		        return "Indefinido";
		    }
	}
		 
		 
	}


