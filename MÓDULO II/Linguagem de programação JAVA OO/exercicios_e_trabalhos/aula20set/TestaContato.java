package aula20set;

public class TestaContato {

	public static void main(String[] args) {

		Contato c1 = new Contato();
		c1.nome = "Waldeck";
		c1.endereco = "xxxxxxx";
		c1.numero = "99999-9999";
		
		System.out.println("Nome = " + c1.nome);
		System.out.println("Telefone = " + c1.numero);
		
	}

}
