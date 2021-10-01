package Aula20Set;

public class testeLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada l1= new Lampada ();
		
		l1.tipo = "led";
		l1.voltagem = 220;
		l1.preco = 8.50;
		l1.potencia = 15;
		l1.marca = "Philips";
		l1.disponibilidade = false;
		l1.status = true;
		
		System.out.println("A marca da lâmapda é "+l1.marca+" do tipo "+l1.tipo+".");
		System.out.println("Está ligada? "+l1.status);
		l1.ligarDesligar();
		System.out.println("Está ligada? "+l1.status);
		
		l1.ligarDesligar();
		System.out.println("Está ligada? "+l1.status);
		System.out.println("A lampada está disponível para compra? "+l1.VerificarDisponibilidade());
	}

}
