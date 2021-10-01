package Aula27Set;

public class CalculadoraExemploOverload {

	public int Subtrair (int num1, int num2) {
		return num1-num2;
	}
	
	public int Subtrair (int num1, int num2, int num3) {
		return num1-num2-num3;
	}
	
	public double Subtrair (double num1, double num2, double num3) {
	
		return num1-num2-num3;
	}
	public static int somar (int num1, int num2) { //método estático
		return num1+num2;
	}
	
}
