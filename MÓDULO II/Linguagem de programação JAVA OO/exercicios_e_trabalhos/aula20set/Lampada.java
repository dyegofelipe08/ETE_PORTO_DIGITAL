package aula20set;

public class Lampada {
	String modelo;
	String marca;
	int voltagem;
	boolean disponibilidade;
	double preco;	
	
	boolean estaLigada;
	
	void ligar() {
		this.estaLigada = true;
	}
	
	void desligar() {
		this.estaLigada = false;
	}
	
	void ligarDesligar() {
		if (estaLigada) {
			this.estaLigada = false;
		} else {
			this.estaLigada = true;
		}
	}
	
	boolean verificarDisponibilidade() {
		return this.disponibilidade;
	}
}
