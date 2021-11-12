package design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPD extends JFrame {
	
	public JanelaPD() {
		super("Titulo da Janela");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		Container c2 = new JPanel();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		BorderLayout border = new BorderLayout();
		c.setLayout(border);
		GridLayout grid = new GridLayout(5,1);
		c2.setLayout(grid);
		
		// CRIANDO COMPONENTES
		JButton botao1 = new JButton("Botao 1");
		JButton botao2 = new JButton("Botao 2");
		JButton botao3 = new JButton("Botao 3");
		JButton botao4 = new JButton("Botao 4");
		JButton botao5 = new JButton("Botao 5");
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(BorderLayout.CENTER, botao1);
		c.add(BorderLayout.EAST, c2);
		c2.add(botao2);
		c2.add(botao3);
		c2.add(botao4);
		c2.add(botao5);
		
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaPD();
	}

}
