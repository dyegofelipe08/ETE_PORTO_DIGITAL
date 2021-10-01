package JOO;

public class Conta {
	
	double Saldo;
	String Usuario;
	
	
	public void sacar(double quantia) {
		
		this.Saldo -=quantia;
		
	}
	
	public void depositar(double quantia) {
		
		this.Saldo +=quantia;
		
	}
	public void exibirSaldo() {
		
		System.out.println(this.Saldo);
	}
	
	

}
