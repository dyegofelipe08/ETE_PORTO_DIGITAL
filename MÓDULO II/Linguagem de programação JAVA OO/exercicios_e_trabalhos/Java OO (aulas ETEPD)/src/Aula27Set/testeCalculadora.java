package Aula27Set;

public class testeCalculadora {

	public static void main(String[] args) {
		
		CalculadoraExemploOverload cal = new CalculadoraExemploOverload();
		
		int n1 = 30, n2= 60, n3=80, resul;
		
		resul = cal.Subtrair(n1, n2, n3);
		
		System.out.println(resul);
		
		resul = CalculadoraExemploOverload.somar(n2, n1);// exemplo de teste de  m�todo est�tico 
		
		
		
		
		
	}

}
