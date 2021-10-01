package aula17set;

public class Carro {
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	Carro() {
		System.out.println("Objeto Carro instanciado com sucesso!");
	}
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, 
			double consumoCombustivel_) {
		System.out.println("Objeto Carro instanciado com todos os atributos com sucesso!");
		this.marca = marca_;
		this.modelo = modelo_;
		this.numPassageiros = numPassageiros_;
		this.capCombustivel = capCombustivel_;
		this.consumoCombustivel = consumoCombustivel_;
	}

	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca_) {
		this.marca = marca_;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + (this.capCombustivel * this.consumoCombustivel) + " km");
	}
	
	void exibirAutonomia2() {
		System.out.println("A autonomia do carro é: " + this.obterAutonomia() + " km");
	}
	
	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		return this.capCombustivel - (km/this.consumoCombustivel);
	}

}
