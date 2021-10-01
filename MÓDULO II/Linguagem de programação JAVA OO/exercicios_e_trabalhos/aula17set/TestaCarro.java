package aula17set;

public class TestaCarro {

	public static void main(String[] args) {

		Carro van = new Carro();	
		van.setMarca("Fiat");	
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		van.setCapCombustivel(100);
		van.setConsumoCombustivel(10);
		
		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
		System.out.println(van.getCapCombustivel());
		System.out.println(van.getConsumoCombustivel());
		
		
//		van.marca = "Fiat";
//		van.modelo = "Ducato";
//		van.numPassageiros = 10;
//		van.capCombustivel = 100;
//		van.consumoCombustivel = 10;
//		System.out.println(van);
//		System.out.println("marca: " + van.marca);
//		System.out.println("modelo: " + van.modelo);
//		van.exibirAutonomia();
//		van.exibirAutonomia2();
//		double qtdCombustivelVan = van.calcularCombustivel(500);
//		System.out.println("A quantidade de combustivel restante foi de: " + qtdCombustivelVan + " litros");
		
		
//		Carro fiesta = new Carro("Ford", "Fiesta", 5, 50, 10);
//		System.out.println("marca: " + fiesta.marca);
//		System.out.println("modelo: " + fiesta.modelo);
//		fiesta.exibirAutonomia();
//		fiesta.exibirAutonomia2();
//		double qtdCombustivelFiesta = fiesta.calcularCombustivel(200);
//		System.out.println("A quantidade de combustivel restante foi de: " + qtdCombustivelFiesta + " litros");
		
	}

}
