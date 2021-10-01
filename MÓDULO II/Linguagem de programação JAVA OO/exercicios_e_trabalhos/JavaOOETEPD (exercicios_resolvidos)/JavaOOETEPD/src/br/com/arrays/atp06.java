package br.com.arrays;

import java.util.Scanner;

/* 
 * Fa�a um programa que leia um vetor N[10]. Troque a seguir, o primeiro elemento com 
 * o �ltimo, o segundo elemento com o pen�ltimo, etc., at� trocar o 5� com o 6�. 
 * Mostre o vetor modificado.
 * 
 * Entrada
 * A entrada cont�m 20 valores inteiros, positivos ou negativos. 
 * Sa�da
 * Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor e Y 
 * � o valor armazenado naquela posi��o.
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
