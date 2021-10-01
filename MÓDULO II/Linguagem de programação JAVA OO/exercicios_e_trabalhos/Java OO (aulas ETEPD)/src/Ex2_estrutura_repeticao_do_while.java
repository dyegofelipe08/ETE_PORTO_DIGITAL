import java.util.Scanner;
public class Ex2_estrutura_repeticao_do_while {

	public static void main(String[] args) {
		
		int n, i = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro qualquer: ");
		
		n = s.nextInt();
		
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		

	}

}
