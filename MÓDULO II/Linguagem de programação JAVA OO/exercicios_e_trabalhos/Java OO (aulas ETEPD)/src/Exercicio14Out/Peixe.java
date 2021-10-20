package Exercicio14Out;

public class Peixe extends Animal {
	String Caracteristicas;

	public Peixe(String nome, String ambiente, String comprimento, String cor, double velocidade, int patas,
			String caracteristicas) {
		super(nome, ambiente, comprimento, cor, velocidade, patas);
		this.Caracteristicas = caracteristicas;
	}
}
