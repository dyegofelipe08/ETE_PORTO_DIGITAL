package br.com;

import java.util.Scanner;

/*
 *  Crie um programa que obtenha do usu�rio 3 notas de exame e 
 *  calcule a m�dia dessas notas. Junto com a m�dia, mostre tamb�m 
 *  um �:-)� no resultado se a m�dia for maior ou igual a 6; caso 
 *  contr�rio mostre �:-(�.
 */

public class q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		double media = (nota1 + nota2 + nota3)/3;
		if (media >= 6) System.out.println(media + " :-)");
		else System.out.println(media + ":-(");
		
	}

}
