package br.com.listamatriz;

import java.util.Scanner;

// Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui. 

public class exe01 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int contador = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = (int) (Math.random() * 20);
				if (matriz[i][j] > 10) {
					contador++;
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nQuantidade de valores maiores que 10 é: " + contador);
		
//		Scanner scan = new Scanner(System.in);
//		int[][] matriz = new int[4][4];
//		int contador = 0;
//		for (int i = 0; i < 4; i++) {		// linha 0 -> coluna 0, 1, 2, 3
//			for (int j = 0; j < 4; j++) {	// linha 1 -> coluna 0, 1, 2, 3
//				System.out.print("Digite matriz[" + i + "][" + j + "] = ");
//				matriz[i][j] = scan.nextInt();
//				if (matriz[i][j] > 10) {
//					contador++;
//				}
//			}
//		}
//		System.out.println("Matriz 4 x 4");
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print(matriz[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("\nQuantidade de valores maiores que 10 é: " + contador);
	}

}
