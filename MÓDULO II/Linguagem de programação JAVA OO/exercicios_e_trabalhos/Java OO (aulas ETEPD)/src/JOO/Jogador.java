package JOO;


public class Jogador {

	int id, numero, qualidade, cartoes;
	String nome, apelido, posicao;
//	Date dataNascimento;
	Boolean suspenso;

	public void VerificarCondicaoDeJogo() {

		if (suspenso) {
			System.out.println("Jogador não apto para jogar!");
		} else {
			System.out.println("Jogador apto para jogar!");
		}

	}

	public Jogador() {

	}

	public Jogador(int id, int numero, int qualidade, int cartoes, String nome, String apelido, String posicao,
			boolean suspenso) {

		this.id = id;
		this.numero = numero;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.nome = nome;
		this.apelido = apelido;
		this.posicao = posicao;
		this.suspenso = suspenso;

	}

}
