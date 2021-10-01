package aula20set;

import java.util.Date;

public class TestaLivroBiblioteca {

	public static void main(String[] args) {

		LivroBiblioteca l1 = new LivroBiblioteca();
		l1.autor = "Goku";
		l1.titulo = "Dragon Ball";
		l1.isbn = "9-99-999-9999";
		l1.numeroPaginas = 235;
		l1.dataEntrega = new Date();
		l1.estaEmprestado = true;
		
		System.out.println("Autor = " + l1.autor);
		System.out.println("O livro do Goku está emprestado? " + l1.estaEmprestado);
		
	}

}
