package Exercicio14Out;

public class Mamifero extends Animal {
	String Alimento;

	public Mamifero(String nome, String ambiente, String comprimento, String cor, double velocidade, int patas, String alimento) {
		super(nome, ambiente, comprimento, cor, velocidade, patas);
		this.Alimento = alimento;
		
	}
}
