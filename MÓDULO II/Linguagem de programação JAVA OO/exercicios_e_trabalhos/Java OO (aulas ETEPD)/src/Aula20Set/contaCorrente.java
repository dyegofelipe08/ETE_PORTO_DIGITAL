package Aula20Set;

public class contaCorrente {

	double saldo, limite;
	int numero;
	boolean contaEspecial = false;
	
	
	public double Sacar(double valor) {
		if (valor>this.saldo) {
			System.out.println("Saldo insuficiente! ");
			if (valor<=this.limite) {
				this.limite -=valor;
				this.saldo -=valor;
				contaEspecial = true;	
				System.out.println("Saque realizado utilizando saldo do limite especial.");
			}else {
				System.out.println("Você não tem saldo e nem limite.");
			}
			
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
		return this.saldo;
		
	}
	public double Depositar(double valor) {
		System.out.println("Deposito realizado com sucesso!");
		return this.saldo+=valor;
		
	}
	
	
	
	
}
