package br.com.listamatriz;

import java.util.Scanner;

// Leia uma matriz 4 x 4, imprima a matriz e retorne a 
// localização (linha e a coluna) do maior valor.   

public class exe04 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 20);
				System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
			}
		}
		
	}

}
