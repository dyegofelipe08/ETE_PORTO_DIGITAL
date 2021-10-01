package br.com.listavetor;

import java.util.Scanner;

// Faça um programa para ler a nota da prova de 15 alunos e armazene 
// num vetor, calcule e imprima a média geral.

public class exe10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetor = new double[5];
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posição " + i + ": ");
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.println("\nA soma dos valores digitados é: " + soma);
		System.out.println("\nO tamanho do vetor é: " + vetor.length);
		System.out.println("\nA média dos valores digitados é: " + media);
	}

}
