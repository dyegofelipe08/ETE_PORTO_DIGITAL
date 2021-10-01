package JOO;

public class TesteConta {

	public static void main(String[] args) {

		Conta transacao = new Conta();
		
		transacao.Saldo = 2000;
		transacao.exibirSaldo();
		transacao.sacar(500);
		transacao.exibirSaldo();
		transacao.depositar(900);
		transacao.exibirSaldo();

	}

}
