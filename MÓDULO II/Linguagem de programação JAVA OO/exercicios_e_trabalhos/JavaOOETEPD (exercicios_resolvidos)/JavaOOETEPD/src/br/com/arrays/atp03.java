package br.com.arrays;

/*
 * Implemente e construa um array com capacidade de armazenar 100 inteiros; 
 * inicialize ent�o cada elemento do array com os n�meros de 0 at� 99 e 
 * imprima-os por meio de uma estrutura for como j� foi exemplificado, 
 * mas em vez de definir explicitamente o intervalo do looping, 
 * utilize o atributo "lenght" do array para definir seu tamanho.
 */

public class atp03 {

	public static void main(String[] args) {

		int[] valores = new int[100];
		for(int i = 0; i < valores.length; i++) {
			valores[i] = i;
			System.out.println(valores[i]);
		}
	}

}
