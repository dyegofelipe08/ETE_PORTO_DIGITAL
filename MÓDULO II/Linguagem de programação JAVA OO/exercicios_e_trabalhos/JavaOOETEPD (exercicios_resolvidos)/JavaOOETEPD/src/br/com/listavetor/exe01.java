package br.com.listavetor;

// Faça um programa que possua um vetor denominado A que armazene 6 
// numeros inteiros. O programa deve executar os seguintes passos:

//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
//(b) Armazene em uma variavel inteira (simples) a soma entre os 
//    valores das posiçoes A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
//(d) Mostre na tela cada valor do vetor A, um em cada linha.

public class exe01 {

	public static void main(String[] args) {
//		int[] A = { 1,0,5,-2,-5,7 };
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		int soma = A[0] + A[1] + A[5];
		System.out.println("A soma é: " + soma);
		A[4] = 100;
		for (int i = 0; i < 6; i++) { // A.lenght
			System.out.println(A[i]);
		}
	}

}
