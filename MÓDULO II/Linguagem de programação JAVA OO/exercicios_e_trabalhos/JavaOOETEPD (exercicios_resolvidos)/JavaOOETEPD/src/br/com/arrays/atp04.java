package br.com.arrays;

import java.util.Scanner;

/* 
 * Fa�a um programa que leia um vetor X[10]. Substitua a seguir, todos os 
 * valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
 * 
 * Entrada
 * A entrada cont�m 10 valores inteiros, podendo ser positivos ou negativos. 
 * Sa�da
 * Para cada posi��o do vetor, escreva "X[i] = x", onde i � a posi��o do 
 * vetor e x � o valor armazenado naquela posi��o.
 */

public class atp04 {

	public static void main(String[] args) {
		
//		int[] X = { 0, -5, 63, 0, 3, 2, -1, 33, 10, 80};
		int[] X = new int[10];
		
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o valor " + (i+1) + ": ");
			X[i] = ler.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (X[i] <= 0) {
				X[i] = 1;
			}
			System.out.println("X[" + i + "] = " + X[i]);
		}
	}

}
