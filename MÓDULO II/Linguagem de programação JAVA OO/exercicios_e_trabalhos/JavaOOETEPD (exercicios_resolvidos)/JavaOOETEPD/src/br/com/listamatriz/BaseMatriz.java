package br.com.listamatriz;

// 1 - declarar um matriz 5 x 5

public class BaseMatriz {

	public static void main(String[] args) {
		// Construindo uma matriz 5 x 5
		int[][] matriz = new int[5][5];
		//			 0  1  2  3  4
		// linha 0 | 2  5 -1  8  7 
		// linha 1 |
		// linha 2 |
		// linha 3 |
		// linha 4 |
		
		// Percorrendo e preenchendo todos os índices da matriz 5 x 5
		for (int i = 0; i < 5; i++) { // i = 0
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = i + j;
			}
		}
		
		// Imprimindo a matriz formatada 5 x 5
		for (int i = 0; i < 5; i++) { // i = 0
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
