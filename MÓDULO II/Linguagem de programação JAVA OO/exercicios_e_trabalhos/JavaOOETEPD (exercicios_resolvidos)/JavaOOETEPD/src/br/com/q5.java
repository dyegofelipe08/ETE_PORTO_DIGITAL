package br.com;

import java.util.Scanner;

/*
 *  Implemente um algoritmo que leia um n�mero e realize a 
 *  contagem de zero at� o n�mero que foi digitado.
 */

public class q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		
//		System.out.println("Contando la�o while...");
//		int contador = 0;
//		while (contador <= numero) {
//			System.out.println(contador);
//			contador++;
//		}
		
//		System.out.println("Contando la�o do-while...");
//		int contador2 = 0;
//		do {
//			System.out.println(contador2);
//			contador2++;
//		} while (contador2 <= numero);
		
		System.out.println("Contando la�o for...");
		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
		
	}
}
