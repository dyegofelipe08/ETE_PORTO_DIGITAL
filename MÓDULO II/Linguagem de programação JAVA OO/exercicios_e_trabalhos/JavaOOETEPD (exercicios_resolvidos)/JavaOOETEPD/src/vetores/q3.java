package vetores;

import java.util.Scanner;

// 3 - Fa�a um Programa que leia 4 notas, mostre as notas e a m�dia na tela.

public class q3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[] notas = new double[4];
		
		double media;
		double total = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i+1) + " nota: ");
			notas[i] = scan.nextDouble();
			total += notas[i];
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i+1) + ": " + notas[i] + " ");
		}
		System.out.println();
		media = total / notas.length;
		System.out.println("A m�dia do aluno foi: " + media);
		
	}

}
