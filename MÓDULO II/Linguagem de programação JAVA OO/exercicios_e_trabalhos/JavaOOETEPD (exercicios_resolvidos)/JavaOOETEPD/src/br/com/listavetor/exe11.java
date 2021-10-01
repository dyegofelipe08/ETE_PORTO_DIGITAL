package br.com.listavetor;

import java.util.Scanner;

// Faça um programa que preencha um vetor com 10 numeros reais, calcule e mostre a
// quantidade de numeros negativos e a soma dos números positivos desse vetor.

public class exe11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetor = new double[5];
		int contadorDeNegativos = 0;
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posição " + i + ": ");
			vetor[i] = scan.nextDouble();
			if (vetor[i] < 0) {
				contadorDeNegativos++;
			} else {
				soma += vetor[i];
			}
		}
		System.out.println("\nA soma dos valores positivos digitados é: " + soma);
		System.out.println("\nA quantidade de valores negativos é: " + contadorDeNegativos);
	}

}
