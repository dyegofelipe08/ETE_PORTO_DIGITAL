import java.util.*;
public class Ex3Vetores {

	public static void main(String[] args) {
		
	double notas [];
	notas = new double [4];
	double soma=0;
	Scanner s = new Scanner(System.in);
	
	for (int i=0; i<notas.length; i++) {
		
		System.out.println("Digite a "+(i + 1)+"ª nota:");
		
		notas[i] = s.nextDouble();
		
		soma = soma + notas[i]; 
		System.out.println("Nota "+(i + 1) + " = " +notas[i]+" ");
	}
	
	double media = (soma/4);
			
			System.out.println("A média do aluno é: "+media+".");

	}

}
