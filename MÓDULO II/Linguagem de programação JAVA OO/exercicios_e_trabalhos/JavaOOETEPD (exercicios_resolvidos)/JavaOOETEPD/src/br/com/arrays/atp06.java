package br.com.arrays;

import java.util.Scanner;

/* 
 * Faça um programa que leia um vetor N[10]. Troque a seguir, o primeiro elemento com 
 * o último, o segundo elemento com o penúltimo, etc., até trocar o 5º com o 6º. 
 * Mostre o vetor modificado.
 * 
 * Entrada
 * A entrada contém 20 valores inteiros, positivos ou negativos. 
 * Saída
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y 
 * é o valor armazenado naquela posição.
 */

public class atp06 {

	public static void main(String[] args) {
		
		int[] N = new int[10];
		int var_aux;
		System.out.println("Vetor normal");
		for (int i = 0; i < N.length; i++) {
			N[i] = (int) (Math.random() * 50);
			System.out.print("N[" + i + "] = " + N[i] + " ");
		}
		System.out.println();
		System.out.println("Vetor invertido");
		for (int i = 0; i < N.length; i++) {
			if (i < (N.length/2)) {
				var_aux = N[i]; 
				N[i] = N[N.length-(i+1)]; 
				N[N.length-(i+1)] = var_aux; 
			}
			System.out.print("N[" + i + "] = " + N[i] + " ");
		}
	}

}
