package br.com.arrays;

import java.util.Scanner;

/* 
 * Fa�a um programa que leia um vetor A[100]. No final, mostre todas as posi��es 
 * do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada 
 * uma das posi��es.
 * 
 * Entrada
 * A entrada cont�m 100 valores, podendo ser inteiros, reais, positivos ou negativos. 
 * Sa�da
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i � a posi��o 
 * do vetor e x � o valor armazenado na posi��o, com uma casa ap�s o ponto decimal.
 */

public class atp07 {

	public static void main(String[] args) {
		
		double[] A = new double[100];
		for (int i = 0; i < A.length; i++) {
			A[i] = Math.random() * 50;
			if (A[i] <= 10) {
				System.out.println("A[" + i + "] = " + A[i]);
			}
		}
	}

}
