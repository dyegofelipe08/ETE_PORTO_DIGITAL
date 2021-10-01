package br.com.arrays;

import java.util.Scanner;

/* 
 * Faça um programa que leia um vetor A[100]. No final, mostre todas as posições 
 * do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada 
 * uma das posições.
 * 
 * Entrada
 * A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos. 
 * Saída
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição 
 * do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
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
