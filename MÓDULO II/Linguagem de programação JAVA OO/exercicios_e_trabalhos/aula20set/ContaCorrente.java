package aula20set;

public class ContaCorrente {
	String titular;
	String agencia;
	String numero;
	double saldo;
	boolean LimiteEspecial;
	double limite;
	
	boolean sacar(double valorASacar) {
		if (this.saldo >= valorASacar) { // se eu tiver saldo
			this.saldo -= valorASacar;
			return true;
		} else { // se eu não tiver saldo
			double limiteTotal = this.saldo + limite;
			if (limiteTotal >= valorASacar ) { // se eu tiver limite para sacar
				this.saldo -= valorASacar;
				this.LimiteEspecial = true;
				return true;
			} else { // eu não ter limite para sacar
				return false;
			}
		}
	}
	
	void depositar(double valorADepositar) {
		this.saldo += valorADepositar;
		if (this.saldo > 0) {
			this.LimiteEspecial = false;
		}
	}
	
	boolean verificarLimiteEspecial() {
		if (LimiteEspecial) {
			return true;
		} else {
			return false;
		}
	}
	
}
