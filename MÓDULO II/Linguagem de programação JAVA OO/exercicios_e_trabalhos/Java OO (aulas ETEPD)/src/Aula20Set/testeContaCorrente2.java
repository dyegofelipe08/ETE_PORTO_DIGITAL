package Aula20Set;

public class testeContaCorrente2 {

	public static void main(String[] args) {
		
		ContaCorrente2 c1 = new ContaCorrente2();
		
		c1.titular ="Dyego";
		c1.agencia = "1606";
		c1.numero = "058555-0";
		c1.limite = 100;
		c1.saldo = -10;
		
		System.out.println("Saldo da conta = R$"+c1.saldo);
		c1.sacar(50);
		System.out.println("Saldo da conta = R$"+c1.saldo);
		System.out.println("Estou utilizando o limite especial? "+c1.verificarLimiteEspecial());
		
		c1.depositar(200);
		
		System.out.println("Saldo da conta = R$"+c1.saldo);
		System.out.println("Estou utilizando o limite especial? "+c1.verificarLimiteEspecial());
		
	}

}
