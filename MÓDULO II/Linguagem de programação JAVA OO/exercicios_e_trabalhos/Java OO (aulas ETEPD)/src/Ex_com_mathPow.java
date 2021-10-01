import java.util.Scanner;

public class Ex_com_mathPow{

	public static void main(String[] args) {
		
		double n, r;
		int e;
		
		
		
		Scanner s = new Scanner (System.in);
		
		
		System.out.println("Digite um número qualquer: ");
		
		n =s.nextDouble();
		
		System.out.println("Digite o expoente: ");
		
		e = s.nextInt();
		
		r=Math.pow(n, e);
		
		System.out.println(n + " elevado a "+e+" = " + r);
	}

}

