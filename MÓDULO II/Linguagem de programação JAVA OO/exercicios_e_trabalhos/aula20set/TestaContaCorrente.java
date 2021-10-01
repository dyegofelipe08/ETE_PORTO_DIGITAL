package aula20set;

public class TestaContaCorrente {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.titular = "Son-Gohan";
		c1.agencia = "1771-0";
		c1.numero = "10004-8";
		c1.LimiteEspecial = true;
		c1.limite = 100;
		c1.saldo = -10;
		System.out.println("Saldo = " + c1.saldo);
		c1.sacar(50);
		System.out.println("Saldo = " + c1.saldo);
		System.out.println("Estou utilizando limite de cheque especial? " + c1.LimiteEspecial);
		
		c1.depositar(200);
		System.out.println("Saldo = " + c1.saldo);
		System.out.println("Estou utilizando limite de cheque especial? " + c1.verificarLimiteEspecial());
		
//		System.out.println("Cliente = " + c1.titular);
	}

}
