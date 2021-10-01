package br.com.arrays;

import java.util.Scanner;

/* 
 * Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o de um 
 * vetor N[10]. Em cada posi��o subsequente, coloque o dobro do valor da posi��o anterior. 
 * Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim 
 * sucessivamente. Mostre o vetor em seguida.
 * 
 * Entrada
 * A entrada cont�m um valor inteiro (V<=50). 
 * Sa�da
 * Para cada posi��o do vetor, escreva "N[i] = X", onde i � a posi��o do vetor e X � o 
 * valor armazenado na posi��o i. O primeiro n�mero do vetor N (N[0]) ir� receber o valor de V.
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
