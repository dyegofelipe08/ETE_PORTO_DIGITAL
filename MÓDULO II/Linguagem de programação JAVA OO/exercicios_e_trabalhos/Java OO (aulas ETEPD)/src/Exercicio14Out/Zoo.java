package Exercicio14Out;

public class Zoo {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Mamifero a2 = new Mamifero();
		Peixe a3 = new Peixe();
		a1.Nome = "Camelo";
		a1.Comprimento = "150 cm";
		a1.Patas = 4;
		a1.Ambiente = "Terra";
		a1.Cor = "Amarelo";
		a1.Ambiente = "Terra";
		a1.Velocidade = 2.0;

		a2.Nome = "Urso do Canadá";
		a2.Comprimento = "180 cm";
		a2.Patas = 4;
		a2.Ambiente = "Terra";
		a2.Cor = "Vermelho";
		a2.Velocidade = 0.5;
		a2.Alimento = "Mel";

		a3.Nome = "Tubarão";
		a3.Comprimento = "300 cm";
		a3.Patas = 0;
		a3.Ambiente = "Mar";
		a3.Cor = "Cinza";
		a3.Velocidade = 1.5;
		a3.Caracteristicas = "Barbatanas e cauda";

		System.out.println("ZOO");
		System.out.println("------------------------------------");
		System.out.println("Animal: " + a1.Nome);
		System.out.println("Comprimento: " + a1.Comprimento);
		System.out.println("Patas: " + a1.Patas);
		System.out.println("Cor: " + a1.Cor);
		System.out.println("Ambiente: " + a1.Ambiente);
		System.out.println("Velocidade: " + a1.Velocidade + " m/s");
		System.out.println("------------------------------------");
		System.out.println("Animal: " + a2.Nome);
		System.out.println("Comprimento: " + a2.Comprimento);
		System.out.println("Patas: " + a2.Patas);
		System.out.println("Cor: " + a2.Cor);
		System.out.println("Ambiente: " + a2.Ambiente);
		System.out.println("Velocidade: " + a2.Velocidade + " m/s");
		System.out.println("Alimento: " + a2.Alimento);
		System.out.println("------------------------------------");
		System.out.println("Animal: " + a3.Nome);
		System.out.println("Comprimento: " + a3.Comprimento);
		System.out.println("Patas: " + a3.Patas);
		System.out.println("Cor: " + a3.Cor);
		System.out.println("Ambiente: " + a3.Ambiente);
		System.out.println("Velocidade: " + a3.Velocidade + " m/s");
		System.out.println("Alimento: " + a3.Caracteristicas);

	}

}
