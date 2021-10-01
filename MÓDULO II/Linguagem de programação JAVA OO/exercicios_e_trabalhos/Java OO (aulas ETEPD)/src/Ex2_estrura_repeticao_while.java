import java.util.Scanner;
public class Ex2_estrura_repeticao_while {

	public static void main(String[] args) {

		int n, i;
		
		i=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro qualquer: ");
		
		n = s.nextInt();
		
		
		while(i<=n) {
			
			System.out.println(i);
			i++;
		}
				
		

	}

}
