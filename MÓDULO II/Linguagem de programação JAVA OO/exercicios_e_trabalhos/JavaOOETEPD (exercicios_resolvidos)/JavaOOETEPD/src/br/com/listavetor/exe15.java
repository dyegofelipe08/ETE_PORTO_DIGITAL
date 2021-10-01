package br.com.listavetor;

import java.util.Scanner;

// Leia um vetor com 20 numeros inteiros. Escreva os elementos 
// do vetor eliminando elementos repetidos.

public class exe15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posição [" + i + "]: ");
			vetor[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = vetor.length-1; j >= 0; j--) {
				if (i != j) {
					if (vetor[i] == vetor[j]) vetor[j] = 0;
				}
			}
			System.out.println("vetor[" + i + "] = " + vetor[i]);
		}
		
	}

}
