package br.com.listavetor;

import java.util.Scanner;

// Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado dos
// componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
// 10 elementos cada. Imprimir todos os conjuntos(vetores)

public class exe03 {

	public static void main(String[] args) {
		double[] vetor1 = new double[10];
		double[] vetor2 = new double[10];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite um valor: ");
			vetor1[i] = scan.nextDouble();
			vetor2[i] = vetor1[i] * vetor1[i];//Math.pow(vetor1[i], 2);
		}
		System.out.println("=========== Vetor 1 ===========");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
		System.out.println();
		System.out.println("=========== Vetor 2 ===========");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + " ");
		}

	}

}
