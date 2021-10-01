package br.com.listavetor;

import java.util.Scanner;

// Fazer um programa para ler 5 valores e, em seguida, mostrar a posição 
// onde se encontram o maior e o menor valor.

public class exe13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] vetor = new double[5];
		double maior = 0;
		double menor = 0;
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("valor da posição " + i + ": ");
			vetor[i] = scan.nextDouble();
			if (i == 0) {
				maior = vetor[0];
				posicaoMaior = i;
				menor = vetor[0];
				posicaoMenor = i;
			} else {
				if (vetor[i] > maior) {
					maior = vetor[i];
					posicaoMaior = i;
				}
				if (vetor[i] < menor) {
					menor = vetor[i];
					posicaoMenor = i;
				}
			}
		}
		System.out.println("O maior valor é: " + maior + " e se encontra na posição: " + posicaoMaior);
		System.out.println("O menor valor é: " + menor + " e se encontra na posição: " + posicaoMenor);
	}

}
