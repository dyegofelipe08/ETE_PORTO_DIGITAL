package design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela4 extends JFrame {
	
	public Janela4() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Título da nossa Janela");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		Container c2 = new JPanel();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		BorderLayout border = new BorderLayout();
		c.setLayout(border);
		GridLayout grid = new GridLayout(4, 1); // Parâmetros => (qtd linhas, qtd colunas)
		c2.setLayout(grid);
		
		// CRIANDO COMPONENTES
//		JButton botao1 = new JButton("Centro");
//		JButton botao2 = new JButton("Salvar");
//		JButton botao3 = new JButton("Alterar");
//		JButton botao4 = new JButton("Apagar");
//		JButton botao5 = new JButton("Ajuda");
		
		// INSERINDO COMPONENTES NO CONTAINER
//		c.add(BorderLayout.CENTER, botao1);
//		c.add(BorderLayout.EAST, c2);
//		c2.add(botao2);
//		c2.add(botao3);
//		c2.add(botao4);
//		c2.add(botao5);

		// CRIANDO E INSERINDO COMPONENTES NO CONTAINER
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		c2.add(new JButton("Salvar"));
		c2.add(new JButton("Alterar"));
		c2.add(new JButton("Apagar"));
		c2.add(new JButton("Ajuda"));
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Janela4();		
	}

}
