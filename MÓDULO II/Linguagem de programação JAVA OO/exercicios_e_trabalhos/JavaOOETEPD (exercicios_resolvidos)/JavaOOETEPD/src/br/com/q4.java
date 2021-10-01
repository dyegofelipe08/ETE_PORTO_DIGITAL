package br.com;

import java.util.Scanner;

/*
 *  Crie um programa que receba como entrada um número e um expoente. 
 *  Calcule esse número elevado ao expoente.
 */

public class q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		System.out.print("Digite um expoente: ");
		int expoente = scan.nextInt();
		double resultado = Math.pow(numero,expoente);
		System.out.println("O resultado é: " + resultado);
		
	}

}
