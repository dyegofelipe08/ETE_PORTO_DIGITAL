import java.util.Scanner;

public class Ex3_estruturas_repeticao_numero_expoente {

	public static void main(String[] args) {
		
		double n, r;
		int e;
		
		r=1;
		
		Scanner s = new Scanner (System.in);
		
		
		System.out.println("Digite um número qualquer: ");
		
		n =s.nextDouble();
		
		System.out.println("Digite o expoente: ");
		
		e = s.nextInt();
		
		for (int i=1; i<=e;i++) {
			
			r=(n*r);
			
		}
		
		System.out.println(n + " elevado a "+e+" = " + r);
	}

}

