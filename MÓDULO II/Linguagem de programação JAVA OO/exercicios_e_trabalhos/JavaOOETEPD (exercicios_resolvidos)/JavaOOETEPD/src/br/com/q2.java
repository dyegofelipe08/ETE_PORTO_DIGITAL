package br.com;

import java.util.Scanner;

/*
 *  Crie um programa que solicite ao usuário digitar um número, 
 *  e mostre-o por extenso. Este número deverá variar entre 1 e 10. 
 *  Se o usuário digitar um número que não está neste intervalo, 
 *  mostre a seguinte mensagem: “número inválido”.
 */

public class q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número entre 1 e 10: ");
		int numero = scan.nextInt();
		
//		if (numero == 1) System.out.println("Você digitou o número um");	
//		else if (numero == 2) System.out.println("Você digitou o número dois");
//		else if (numero == 3) System.out.println("Você digitou o número três");
//		else if (numero == 4) System.out.println("Você digitou o número quatro");
//		else if (numero == 5) System.out.println("Você digitou o número cinco");
//		else if (numero == 6) System.out.println("Você digitou o número seis");
//		else if (numero == 7) System.out.println("Você digitou o número sete");
//		else if (numero == 8) System.out.println("Você digitou o número oito");
//		else if (numero == 9) System.out.println("Você digitou o número nove");
//		else if (numero == 10) System.out.println("Você digitou o número dez");
//		else System.out.println("o número digitado precisa estar entre 1 e 10.");
		
		switch (numero) {
			case 1: System.out.println("Você digitou o número um"); break;
			case 2: System.out.println("Você digitou o número dois"); break;
			case 3: System.out.println("Você digitou o número três"); break;
			case 4: System.out.println("Você digitou o número quatro"); break;
			case 5: System.out.println("Você digitou o número cinco"); break;
			case 6: System.out.println("Você digitou o número seis"); break;
			case 7: System.out.println("Você digitou o número sete"); break;
			case 8: System.out.println("Você digitou o número oito"); break;
			case 9: System.out.println("Você digitou o número nove"); break;
			case 10: System.out.println("Você digitou o número dez"); break;
			default: System.out.println("o número digitado precisa estar entre 1 e 10."); break;
		}
		
	}

}
