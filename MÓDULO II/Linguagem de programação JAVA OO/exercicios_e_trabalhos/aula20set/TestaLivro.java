package aula20set;

public class TestaLivro {

	public static void main(String[] args) {

		Livro l1 = new Livro();
		l1.autor = "Goku";
		l1.titulo = "Dragon Ball";
		l1.isbn = "9-99-999-9999";
		l1.numeroPaginas = 235;
		
		System.out.println("Autor = " + l1.autor);
		
	}

}
