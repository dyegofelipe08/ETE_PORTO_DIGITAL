package br.com.listamatriz;

import java.util.Scanner;

// Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da 
// linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.  

public class exe03 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i * j;
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
