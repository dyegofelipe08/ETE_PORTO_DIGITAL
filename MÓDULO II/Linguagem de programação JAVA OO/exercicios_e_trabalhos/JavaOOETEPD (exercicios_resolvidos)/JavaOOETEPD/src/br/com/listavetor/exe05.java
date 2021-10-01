package br.com.listavetor;

import java.util.Scanner;

// Faça um programa que receba do usuario um vetor com 10 posições. Em seguida 
// deverá ser impresso o maior e o menor elemento do vetor.

public class exe05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor para o vetor: "); // 5, 10, 1 vetor[2] = 1
			vetor[i] = scan.nextInt();
			if (i == 0) { // i = 2
				maior = vetor[i];
				menor = vetor[i];
			} 
			if (vetor[i] > maior) maior = vetor[i]; // maior = 5, 10
			if (vetor[i] < menor) menor = vetor[i]; // menor = 5, 2
			
		}
		System.out.println();
		System.out.println("O tamanho do vetor é: " + vetor.length);
		System.out.println("O maior valor desse vetor é: " + maior);
		System.out.println("O menor valor desse vetor é: " + menor);
		
	}

}
