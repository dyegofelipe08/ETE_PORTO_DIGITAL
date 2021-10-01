import java.util.Scanner;

public class Ex_estrutura_controle_switch_case {

	public static void main(String[] args) {
		
		
		int n;
		
		System.out.println("Digite um número inteiro de 0 a 10: ");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		switch (n) {
		case 0:
			System.out.println("Zero.");
			break;
		case 1:
			System.out.println("Um.");
			break;
		case 2:
			System.out.println("Dois.");
			break;
		case 3:
			System.out.println("Três.");
			break;
		case 4:
			System.out.println("Quatro.");
			break;
		case 5:
			System.out.println("Cinco.");
			break;
		case 6: 
			System.out.println("Seis.");
			break;
		case 7:
			System.out.println("Sete.");
			break;
		case 8:
			System.out.println("Oito.");
		case 9:
			System.out.println("Nove.");
			break;
		case 10:
			System.out.println("Dez.");
			break;
			default:
				System.out.println("Número inválido!");
		}
		
	}

}

