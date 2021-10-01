package br.com.arrays;

import java.util.Scanner;

/* 
 * Leia um valor e faça um programa que coloque o valor lido na primeira posição de um 
 * vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior. 
 * Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim 
 * sucessivamente. Mostre o vetor em seguida.
 * 
 * Entrada
 * A entrada contém um valor inteiro (V<=50). 
 * Saída
 * Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o 
 * valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.
 */

public class atp05 {

	public static void main(String[] args) {
		
		int[] N = new int[10];
		int V;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		V = ler.nextInt();
		if (V <= 50) {
			N[0] = V;
			for (int i = 0; i < 10; i++) {
				if (i == 0) {
					System.out.println("N[" + i + "] = " + N[i]);
				} else {
					N[i] = 2 * N[i-1];
					System.out.println("N[" + i + "] = " + N[i]);
				}	
			}
		}
	}

}
