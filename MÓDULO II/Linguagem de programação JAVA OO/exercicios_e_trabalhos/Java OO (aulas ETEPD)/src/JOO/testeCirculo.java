package JOO;

public class testeCirculo {

	public static void main(String[] args) {
		
		circulo calculo = new circulo ();
		
		calculo.raio = 10;
		calculo.area = 3.14 * Math.pow(calculo.raio,2);
		calculo.perimetro = 2 * 3.14 * calculo.raio;
		
		
		System.out.println("A �rea do c�rculo � = "+calculo.area+" mm. O per�metro � = "+calculo.perimetro+" mm.");
				
		

	}

}
