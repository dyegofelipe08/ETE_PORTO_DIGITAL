import java.util.Scanner;
public class Ex1Vetores {

	public static void main(String[] args) {
		
		
		int  n[];
		
		n = new int [5];
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite 5 números inteiros: ");
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("Digite o "+(i + 1) +"º número: ");
			n[i]=s.nextInt();
			
		}
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("Número na posição "+(i + 1)+" do vetor: "+n[i]);
		}
		

	}

}
