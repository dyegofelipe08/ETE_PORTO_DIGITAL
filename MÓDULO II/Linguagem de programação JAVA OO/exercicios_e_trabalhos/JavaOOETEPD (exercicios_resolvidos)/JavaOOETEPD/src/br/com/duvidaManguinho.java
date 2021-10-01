package br.com;

public class duvidaManguinho {

	public static void main(String[] args) {

		int[][] val = new int[4][4];
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				if (linha == coluna) {
					val[linha][coluna] = 1;
				}
				System.out.print(val[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
	}

}
