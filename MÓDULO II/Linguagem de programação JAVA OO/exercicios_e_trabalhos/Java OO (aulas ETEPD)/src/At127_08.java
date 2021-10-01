
public class At127_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz [][] = new int [4][4];
		int maior = 0, linha = 0, coluna = 0;
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz.length; j++) {
				matriz [i] [j] = i*j;
				if (matriz [i][j]>maior) {
					maior = matriz [i][j];
					linha = i;
					coluna =j;
				}

				
				System.out.print(matriz [i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println("O maior valor contido na matriz é: "+maior);
		System.out.println("Ele se encontra na posição: ["+linha+","+coluna+"].");
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * double vetor [] = {0,1,2,3,4,5,6,7,8,9}; double maior = 0, menor = 9, soma =
		 * 0, media; for (int i = 0; i<10; i++) { if (vetor [i]>maior) maior = vetor[i];
		 * if (vetor[i]<menor) menor = vetor [i]; soma = soma + vetor [i];
		 * 
		 * } media = soma/vetor.length;
		 * System.out.println("O maior número é "+maior+";");
		 * System.out.println("O menor número é "+menor+";");
		 * System.out.println("A média entre os núemros do vetor é: "+media+".");
		 */
		
		
		
	}

}
