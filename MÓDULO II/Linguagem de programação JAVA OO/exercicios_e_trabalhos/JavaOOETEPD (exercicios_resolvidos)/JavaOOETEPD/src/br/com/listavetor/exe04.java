package br.com.listavetor;

import java.util.Scanner;

// Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois 
// valores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa
// deverá escrever a soma dos valores encontrados nas respectivas posições  X e Y

public class exe04 {

	public static void main(String[] args) {

		int[] vetor = { 1,2,3,4,5,6,7,8 };
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de X: ");
		int X = scan.nextInt();
		System.out.print("Digite o valor de Y: ");
		int Y = scan.nextInt();
		System.out.println("o Valor armazenado no vetor na posição X é: " + vetor[X]);
		System.out.println("o Valor armazenado no vetor na posição Y é: " + vetor[Y]);
		
		
	}

}
