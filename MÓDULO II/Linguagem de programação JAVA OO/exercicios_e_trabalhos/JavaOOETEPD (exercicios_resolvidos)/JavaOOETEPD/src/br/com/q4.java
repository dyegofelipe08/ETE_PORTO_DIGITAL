package br.com;

import java.util.Scanner;

/*
 *  Crie um programa que receba como entrada um n�mero e um expoente. 
 *  Calcule esse n�mero elevado ao expoente.
 */

public class q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		System.out.print("Digite um expoente: ");
		int expoente = scan.nextInt();
		double resultado = Math.pow(numero,expoente);
		System.out.println("O resultado �: " + resultado);
		
	}

}
