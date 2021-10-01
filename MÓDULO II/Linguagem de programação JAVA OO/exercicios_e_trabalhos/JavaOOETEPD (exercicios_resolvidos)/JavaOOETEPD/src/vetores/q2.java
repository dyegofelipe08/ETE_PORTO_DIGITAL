package vetores;

//2 - Faça um Programa que leia um vetor de 10 números 
//    inteiros e mostre o maior e o menor número do vetor.

public class q2 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int maior = 0; // 10, 35
		int menor = 100; // 10, 7
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) ((Math.random() * 100)); // valor = 10, valor = 7, valor = 35
			System.out.print(numeros[i] + " ");
			// 10 > 0, 7 > 10, 35 > 10
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			// 10 < 100, 7 < 10, 35 < 7
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println();
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		
	}

}
