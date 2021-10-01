package Aula20Set;

public class Lampada {
	
	String marca, tipo;
	int potencia,voltagem;
	double preco;
	boolean disponibilidade, status;
	
	public void ligarLampada() {
		this.status = true;
	
	}
	public void desligarLampada() {
		this.status = false;
	
	}
	void ligarDesligar() {
		if (status) status = false;
		else status = true;
		
	}
	boolean VerificarDisponibilidade () {
		return this.disponibilidade;
		
	}
	
	
	
	

}
