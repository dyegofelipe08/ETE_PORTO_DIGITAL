package vetores;

// 1 - Crie um vetor de 10 posi��es com valores de 0 a 100 e 
//     calcule a m�dia dos valores.

public class qe1 {

	public static void main(String[] args) {
		double[] numeros = new double[10];
		double soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.random() * 100;
			soma += numeros[i];
			System.out.println("Posi��o " + (i+1) + ": " + numeros[i]);
		}
		System.out.println("A m�dia dos valores recebidos �: " + (soma/numeros.length));
		
	}

}
