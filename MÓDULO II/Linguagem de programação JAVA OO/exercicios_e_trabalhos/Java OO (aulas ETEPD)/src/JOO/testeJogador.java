package JOO;

public class testeJogador {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();//Utlizando o método vazio
		
		j1.nome = "Daniel Alves";
		System.out.println(j1.nome);
		System.out.println(j1.apelido);
		System.out.println(j1.posicao);
		System.out.println(j1.id);
		System.out.println(j1.qualidade);
	
		
		Jogador j2 = new Jogador (1,10,75,1,"Roberto","bebeto","Ataque",false);
		
		System.out.println(j2.apelido);
		System.out.println(j2.cartoes);
		System.out.println(j2.id);
		System.out.println(j2.numero);
		System.out.println(j2.nome);
		System.out.println(j2.posicao);
		System.out.println(j2.qualidade);
		
		j2.VerificarCondicaoDeJogo();
		
	
		
		
		
		
		

	}

}
