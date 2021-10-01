package aula20set;

public class TestaLampada {

	public static void main(String[] args) {

		Lampada l1 = new Lampada();
		l1.marca = "Philips";
		l1.modelo = "P12";
		l1.voltagem = 220;
		l1.disponibilidade = false;
		l1.preco = 10;
		l1.estaLigada = true;
		
		System.out.println("Marca = " + l1.marca + ", Preço = " + l1.preco);
		System.out.println("A lâmpada está ligada? " + l1.estaLigada);
//		l1.desligar();
		l1.ligarDesligar();
		System.out.println("A lâmpada está ligada? " + l1.estaLigada);
//		l1.ligar();
		l1.ligarDesligar();
		System.out.println("A lâmpada está ligada? " + l1.estaLigada);
		
		System.out.println("A lâmpada está disponível para compra? " + l1.verificarDisponibilidade());
		
		
		
	}

}
