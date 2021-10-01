package Aula20Set;

public class ContaCorrente2 {
	
	String titular, agencia, numero;
	double saldo, limite;
	boolean limiteEspecial;
	
	boolean sacar (double quantia) {
		
		if (quantia<=this.saldo) {
			this.saldo -=quantia;
			return true;
		}
		
		else {
			double limiteTotal = this.limite + this.saldo;
			if (quantia <= limiteTotal) {
				this.saldo -=quantia;
				this.limiteEspecial = true;
				return true;
			}else {
				return false;
			}
			
		}
	}
	void depositar (double quantia) {
		this.saldo += quantia;
		if (this.saldo >=0) this.limiteEspecial = false;
	}
	
	boolean verificarLimiteEspecial() {
		if (this.limiteEspecial) {
			return true;
		}else {
			return false;
		}
			
		
	}
	

}
