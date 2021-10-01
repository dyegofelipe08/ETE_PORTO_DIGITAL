package JOO;

public class testeRetangulo {

	public static void main(String[] args) {

		Retangulo ret1 = new Retangulo(10,20);
		Retangulo ret2 = new Retangulo(10,20);

		/*
		 * ret1.lado1 = 10; ret1.lado2 = 20; ret2.lado1 = 15; ret2.lado2 = 20;
		 */

//		ret1.CalcularArea();
//		ret2.CalcularArea();
//
//		if (ret1.area == ret2.area)
//			System.out.println("As áreas dos retangulos são iguais.");
//		else
//			System.out.println("As áreas dos retangulos são diferentes.");
//		
//		System.out.println(ret1.lado1);
//		System.out.println(ret1.lado2);
//		System.out.println(ret2.lado1);
//		System.out.println(ret2.lado2);
//		System.out.println(ret1.area);
//		System.out.println(ret2.area);
		System.out.println("Aplicando get e set: ");
		
		ret1.setLado1(15);
		ret1.setLado2(30);
		ret2.setLado1(25);
		ret2.setLado2(40);
		
		System.out.println(ret1.getLado1());
		System.out.println(ret1.getLado2());
		System.out.println(ret2.getLado1());
		System.out.println(ret2.getLado2());

		/*
		 * Retangulo ret = new Retangulo();
		 * 
		 * ret.lado1 = 5; ret.lado2 = 8; ret.area = ret.lado1 * ret.lado2; ret.perimetro
		 * = (2*ret.lado1)+(2*ret.lado2);
		 * 
		 * System.out.println(ret.area); System.out.println(ret.perimetro);
		 */

		/*
		 * Retangulo teste = new Retangulo();
		 * 
		 * 
		 * teste.CalcularArea(10, 3);
		 * 
		 * System.out.println(teste.area);
		 */

	}

}
