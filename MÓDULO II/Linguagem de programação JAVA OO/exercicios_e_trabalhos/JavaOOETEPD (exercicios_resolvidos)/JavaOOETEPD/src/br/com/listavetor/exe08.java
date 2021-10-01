package br.com.listavetor;

import java.util.Scanner;

// Crie um programa que le 6 valores inteiros e, em seguida, 
// mostre na tela os valores lidos na ordem inversa.

public class exe08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[6];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor para o vetor: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Ordem normal");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\nOrdem inversa");
		for (int i = (vetor.length-1); i >= 0; i--) {
			vetor[vetor.length-1] = vetor[i];
			System.out.print(vetor[i] + " ");
		}
		
	}

}
