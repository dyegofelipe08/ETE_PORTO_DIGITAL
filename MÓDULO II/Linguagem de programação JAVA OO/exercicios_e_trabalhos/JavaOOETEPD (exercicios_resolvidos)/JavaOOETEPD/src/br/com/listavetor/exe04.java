package br.com.listavetor;

import java.util.Scanner;

// Fa�a um programa que leia um vetor de 8 posi��es e, em seguida, leia tamb�m dois 
// valores X e Y quaisquer correspondentes a duas posi��es no vetor. Ao final seu programa
// dever� escrever a soma dos valores encontrados nas respectivas posi��es  X e Y

public class exe04 {

	public static void main(String[] args) {

		int[] vetor = { 1,2,3,4,5,6,7,8 };
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de X: ");
		int X = scan.nextInt();
		System.out.print("Digite o valor de Y: ");
		int Y = scan.nextInt();
		System.out.println("o Valor armazenado no vetor na posi��o X �: " + vetor[X]);
		System.out.println("o Valor armazenado no vetor na posi��o Y �: " + vetor[Y]);
		
		
	}

}
