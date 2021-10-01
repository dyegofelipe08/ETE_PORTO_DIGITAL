package br.com.listavetor;

import java.util.Scanner;

// Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. 
// Imprima o vetor, o maior elemento e a posição que ele se encontra

public class exe07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior = 0;
		int posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor para o vetor: ");
			vetor[i] = scan.nextInt();
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("O maior valor do vetor é: " + maior);
		System.out.println("O posição referente ao maior valor do vetor é: " + posicao);
		
	}

}
