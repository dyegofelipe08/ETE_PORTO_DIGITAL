package br.com;

// Crie um programa que mostre seu nome 20 vezes.


public class q3 {
	
	public static void main(String[] args) {
		String meuNome = "Waldeck";
		
//		int contador = 1;
//		while (contador <= 20) {
//			System.out.println(contador + " - " + meuNome);
//			contador++;
//		}
		
//		int contador = 0;
//		do {
//			System.out.println(contador+1 + " - " + meuNome);
//			contador++;
//		} while (contador < 20);
		
		for (int contador = 0; contador < 20; contador++) {
			System.out.println(contador+1 + " - " + meuNome);
		}
	}

}
