package br.com.arrays;

/*
 * implemente e execute uma nova classe que construa um array com capacidade 
 * de armazenar 100 inteiros, mas dessa vez inicialize cada elemento do array 
 * com os números de 1 até 100 e imprima-os por meio de uma estrutura for, 
 * conforme foi exemplificado.
 */

public class atp02 {

	public static void main(String[] args) {
		
		int[] valores = new int[100];
		for(int i = 1; i <= 100; i++) {
			valores[i-1] = i;
			System.out.println(valores[i-1]);
		}
		
	}

}
