import java.util.Scanner;

public class Ex_estrura_controle_if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		System.out.println("Digite um número inteiro entre 0 e 10: ");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		if (n==0) {
			
			 System.out.println("Zero.");
			
		}
		else if (n==1) {
			
			System.out.println("Um.");
		}
		else if (n==2) {
			
			System.out.println("Dois.");
		}
		else if (n==3) {
			
			System.out.println("Três.");
		}
		else if (n==4) {
			
			System.out.println("Quatro.");
		}
		else if (n==5) {
			
			System.out.println("Cinco.");
		}
		else if (n==6) {
			
			System.out.println("Seis.");
		}
		else if (n==7) {
			
			System.out.println("Sete.");
		}
		else if (n==8) {
			
			System.out.println("Oito.");
		}
		else if (n==9) {
			
			System.out.println("Nove.");
		}
		else if (n==10) {
			
			System.out.println("Dez.");
		}
		else {
			System.out.println("Número inválido!");
		}

	}

}

