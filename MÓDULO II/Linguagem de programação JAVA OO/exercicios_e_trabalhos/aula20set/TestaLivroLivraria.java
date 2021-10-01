package aula20set;

public class TestaLivroLivraria {

	public static void main(String[] args) {
		LivroLivraria l1 = new LivroLivraria();
		l1.autor = "Goku";
		l1.titulo = "Dragon Ball";
		l1.isbn = "9-99-999-9999";
		l1.numeroPaginas = 235;
		l1.preco = 12.99;
		
		System.out.println("Autor = " + l1.autor);
		System.out.println("Preço = " + l1.preco);
	}

}
