import java.util.Scanner;
public class Ex2Vetores {

	public static void main(String[] args) {
		
		int n[];
		
		n = new int [10];
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite 10 n�meros inteiros: ");
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("Digite o "+(i + 1) +"� n�mero: ");
			n[i]=s.nextInt();
		}
		
	

	}

}
