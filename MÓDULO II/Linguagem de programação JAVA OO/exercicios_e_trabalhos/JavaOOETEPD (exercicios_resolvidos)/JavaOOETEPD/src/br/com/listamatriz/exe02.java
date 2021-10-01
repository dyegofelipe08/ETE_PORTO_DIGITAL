package br.com.listamatriz;

import java.util.Scanner;

// Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e 
// com 0 os demais elementos. Escreva ao final a matriz obtida. 

public class exe02 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) matriz[i][j] = 1;
				else matriz[i][j] = 0;
//				else matriz[i][j] = (int) (Math.random() * 20);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
