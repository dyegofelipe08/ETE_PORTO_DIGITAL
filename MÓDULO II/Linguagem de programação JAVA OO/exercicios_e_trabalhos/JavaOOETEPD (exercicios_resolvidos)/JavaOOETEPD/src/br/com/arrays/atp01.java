package br.com.arrays;

/*
 * Abra sua IDE de prefer�ncia, implemente e execute uma classe que construa 
 * um array com capacidade de armazenar 100 inteiros. Inicialize ent�o cada 
 * elemento do array com os n�meros de 0 at� 99 e imprima-os por interm�dio de uma 
 * estrutura for, como foi exemplificado.
 */

public class atp01 {

	public static void main(String[] args) {
		
		int[] valores = new int[100];
		for(int i = 0; i < 100; i++) {
			valores[i] = i;
			System.out.println(valores[i]);
		}
		
	}

}
