package br.com.listavetor;

import java.util.Scanner;

//Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.

public class exe06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor para o vetor: ");
			vetor[i] = scan.nextInt();
			if (i == 0) {
				maior = vetor[0];
				menor = vetor[0];
			} else {
				if (vetor[i] > maior) maior = vetor[i];
				if (vetor[i] < menor) menor = vetor[i];
			}
		}
		System.out.println();
		System.out.println("O maior valor do vetor é: " + maior);
		System.out.println("O menor valor do vetor é: " + menor);
		
	}

}
