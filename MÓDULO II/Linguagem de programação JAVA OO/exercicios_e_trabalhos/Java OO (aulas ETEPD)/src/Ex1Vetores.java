import java.util.Scanner;
public class Ex1Vetores {

	public static void main(String[] args) {
		
		
		int  n[];
		
		n = new int [5];
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite 5 n�meros inteiros: ");
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("Digite o "+(i + 1) +"� n�mero: ");
			n[i]=s.nextInt();
			
		}
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("N�mero na posi��o "+(i + 1)+" do vetor: "+n[i]);
		}
		

	}

}
