package br.com.listamatriz;

import java.util.Scanner;

// Leia uma matriz 5 x 5. Leia tamb�m um valor X. O programa dever� fazer uma busca 
// desse valor na matriz e, ao final, escrever a localiza��o (linha e coluna) ou uma 
// mensagem de �n�o encontrado�.   

public class exe05 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		Scanner scan = new Scanner(System.in);
		boolean naoEncontrado = false; // false -> valor n�o encontrado
		System.out.print("Buscar (entre 0 - 9): ");
		int buscador = scan.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);	
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nResultado da busca");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == buscador) {
					System.out.println("Valor encontrado na linha: " + i + " e coluna: " + j);
					naoEncontrado = true; // true -> valor encontrado
				}
			}
		}
		if (!naoEncontrado) System.out.println("n�o encontrado");
		
	}

}
