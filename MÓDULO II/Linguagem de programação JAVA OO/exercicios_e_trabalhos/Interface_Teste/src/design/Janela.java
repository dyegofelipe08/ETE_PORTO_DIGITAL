package design;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Título da nossa Janela");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		BorderLayout border = new BorderLayout();
//		BorderLayout border = new BorderLayout(15, 5); // Só irá funcionar se passarmos em tempo de execução
//		c.setLayout(border);
		
		// CRIANDO COMPONENTES
//		JButton botao1 = new JButton("Norte");
//		JButton botao2 = new JButton("Sul");
//		JButton botao3 = new JButton("Leste");
//		JButton botao4 = new JButton("Oeste");
//		JButton botao5 = new JButton("Centro");
		
		// INSERINDO COMPONENTES NO CONTAINER
//		c.add(BorderLayout.NORTH, botao1);
//		c.add(BorderLayout.SOUTH, botao2);
//		c.add(BorderLayout.EAST, botao3);
//		c.add(BorderLayout.WEST, botao4);
//		c.add(BorderLayout.CENTER, botao5);

		// CRIANDO E INSERINDO COMPONENTES NO CONTAINER
		c.add(BorderLayout.NORTH, new JButton("Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Sul"));
		c.add(BorderLayout.EAST, new JButton("Leste"));
		c.add(BorderLayout.WEST, new JButton("Oeste"));
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Janela();		
	}

}
