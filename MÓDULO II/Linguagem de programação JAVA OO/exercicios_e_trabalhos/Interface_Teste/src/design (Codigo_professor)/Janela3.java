package design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela3 extends JFrame {
	
	public Janela3() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Título da nossa Janela");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		GridLayout grid = new GridLayout(2, 3); // Parâmetros => (qtd linhas, qtd colunas)
		c.setLayout(grid);
		
		// CRIANDO COMPONENTES
//		JButton botao1 = new JButton("Botao 1");
//		JButton botao2 = new JButton("Botao 2");
//		JButton botao3 = new JButton("Botao 3");
//		JButton botao4 = new JButton("Botao 4");
//		JButton botao5 = new JButton("Botao 5");
		
		// INSERINDO COMPONENTES NO CONTAINER
//		c.add(botao1);
//		c.add(botao2);
//		c.add(botao3);
//		c.add(botao4);
//		c.add(botao5);

		// CRIANDO E INSERINDO COMPONENTES NO CONTAINER
		c.add(new JButton("Botao 1"));
		c.add(new JButton("Botao 2"));
		c.add(new JButton("Botao 3"));
		c.add(new JButton("Botao 4"));
		c.add(new JButton("Botao 5"));
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Janela3();		
	}

}
