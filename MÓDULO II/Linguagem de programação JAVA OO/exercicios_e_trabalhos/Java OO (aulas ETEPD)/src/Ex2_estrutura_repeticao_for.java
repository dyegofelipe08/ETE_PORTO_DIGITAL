import java.util.Scanner;
public class Ex2_estrutura_repeticao_for {

	public static void main(String[] args) {

		int n;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro qualquer: ");
		n = s.nextInt();
		
		for (int i=0;i<=n;i++) {
			
			System.out.println(i);
		}

	}

}
