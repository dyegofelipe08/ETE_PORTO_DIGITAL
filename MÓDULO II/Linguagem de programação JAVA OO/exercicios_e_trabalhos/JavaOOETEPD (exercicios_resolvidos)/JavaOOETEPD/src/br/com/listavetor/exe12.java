package br.com.listavetor;

import java.util.Scanner;

// Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores 
// lidos juntamente com o maior, o menor e a media dos valores.

public class exe12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetor = new double[5];
		double soma = 0;
		double maior = 0;
		double menor = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posição " + i + ": ");
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
			if (i == 0) {
				maior = vetor[0];
				menor = vetor[0];
			} else {
				if (vetor[i] > maior) maior = vetor[i];
				if (vetor[i] < menor) menor = vetor[i];
			}
		}
		double media = soma / vetor.length;
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A média dos valores é: " + media);
	}

}
