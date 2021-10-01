import java.util.Scanner;

public class Ex_estrura_controle_if {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá! Digite a primeira nota: ");
		
		n1 = s.nextDouble();
		
		System.out.println("Agora, a segunta nota: ");
		
		n2 = s.nextDouble();
		
		System.out.println("Para finalizar, a terceira nota: ");
		
		n3 = s.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		if (media>=6.0) {
			
			System.out.println("Sua média é: " + media + " :-)");
		}
		else {
			
			System.out.println("Sua média é: " + media + " :-(");
		}
		

	}
}


