package br.com.listavetor;

import java.util.Scanner;

// Fa�a um programa que leia um vetor de 10 posi��es e verifique 
// se existem valores iguais e os escreva na tela.

public class exe14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posi��o [" + i + "]: ");
			vetor[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = vetor.length-1; j >= 0; j--) {
				if (i != j) {
					if (vetor[i] == vetor[j]) System.out.println("Valores iguais vetor[" + i + "] = " + vetor[i] + " e vetor[" + j + "] = " + vetor[j]);
				}
			}
		}
		
	}

}
