
package Aula20Set;

public class testeContaCorrente {

	public static void main(String[] args) {
		
		contaCorrente c1 = new contaCorrente();
		
		
		c1.limite = 2000;
		c1.saldo = 1000;
		
		c1.Sacar(2500);
		System.out.println("Seu novo saldo ?: "+c1.saldo+".");
//		c1.Depositar(500);
//		System.out.println("Seu novo saldo ?: "+c1.saldo+".");
//		

	}

}
