import java.util.Scanner;
public class Ex2Vetores {

	public static void main(String[] args) {
		
		int n[];
		
		n = new int [10];
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite 10 números inteiros: ");
		
		for (int i=0; i<n.length;i++) {
			
			System.out.println("Digite o "+(i + 1) +"º número: ");
			n[i]=s.nextInt();
		}
		
	

	}

}
