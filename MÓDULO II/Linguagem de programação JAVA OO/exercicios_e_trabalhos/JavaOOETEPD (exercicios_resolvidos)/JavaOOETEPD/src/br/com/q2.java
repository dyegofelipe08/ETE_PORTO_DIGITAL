package br.com;

import java.util.Scanner;

/*
 *  Crie um programa que solicite ao usu�rio digitar um n�mero, 
 *  e mostre-o por extenso. Este n�mero dever� variar entre 1 e 10. 
 *  Se o usu�rio digitar um n�mero que n�o est� neste intervalo, 
 *  mostre a seguinte mensagem: �n�mero inv�lido�.
 */

public class q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero entre 1 e 10: ");
		int numero = scan.nextInt();
		
//		if (numero == 1) System.out.println("Voc� digitou o n�mero um");	
//		else if (numero == 2) System.out.println("Voc� digitou o n�mero dois");
//		else if (numero == 3) System.out.println("Voc� digitou o n�mero tr�s");
//		else if (numero == 4) System.out.println("Voc� digitou o n�mero quatro");
//		else if (numero == 5) System.out.println("Voc� digitou o n�mero cinco");
//		else if (numero == 6) System.out.println("Voc� digitou o n�mero seis");
//		else if (numero == 7) System.out.println("Voc� digitou o n�mero sete");
//		else if (numero == 8) System.out.println("Voc� digitou o n�mero oito");
//		else if (numero == 9) System.out.println("Voc� digitou o n�mero nove");
//		else if (numero == 10) System.out.println("Voc� digitou o n�mero dez");
//		else System.out.println("o n�mero digitado precisa estar entre 1 e 10.");
		
		switch (numero) {
			case 1: System.out.println("Voc� digitou o n�mero um"); break;
			case 2: System.out.println("Voc� digitou o n�mero dois"); break;
			case 3: System.out.println("Voc� digitou o n�mero tr�s"); break;
			case 4: System.out.println("Voc� digitou o n�mero quatro"); break;
			case 5: System.out.println("Voc� digitou o n�mero cinco"); break;
			case 6: System.out.println("Voc� digitou o n�mero seis"); break;
			case 7: System.out.println("Voc� digitou o n�mero sete"); break;
			case 8: System.out.println("Voc� digitou o n�mero oito"); break;
			case 9: System.out.println("Voc� digitou o n�mero nove"); break;
			case 10: System.out.println("Voc� digitou o n�mero dez"); break;
			default: System.out.println("o n�mero digitado precisa estar entre 1 e 10."); break;
		}
		
	}

}
