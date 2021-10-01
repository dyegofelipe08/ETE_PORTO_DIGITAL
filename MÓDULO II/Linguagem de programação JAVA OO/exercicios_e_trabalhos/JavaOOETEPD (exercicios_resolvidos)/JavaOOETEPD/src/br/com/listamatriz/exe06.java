package br.com.listamatriz;

import java.util.Scanner;

// Leia duas matrizes 4 x 4 e escreva uma terceira com os 
// maiores valores de cada posição das matrizes lidas.  

public class exe06 {

	public static void main(String[] args) {
		int[][] matrizA = new int[5][5];
		int[][] matrizB = new int[5][5];
		int[][] matrizC = new int[5][5];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = (int) (Math.random() * 10);
				matrizB[i][j] = (int) (Math.random() * 10);
			}
		}
		
		System.out.println("MATRIZ 1");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMATRIZ 2");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMATRIZ 3");
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				if (matrizA[i][j] >= matrizB[i][j]) matrizC[i][j] = matrizA[i][j];
				else matrizC[i][j] = matrizB[i][j];
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
	}

}
