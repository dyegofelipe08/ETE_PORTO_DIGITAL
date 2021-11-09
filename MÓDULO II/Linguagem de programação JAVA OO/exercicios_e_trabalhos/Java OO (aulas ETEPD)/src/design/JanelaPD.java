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
		
		//Titulo da janela
		setTitle("Titulo da Janela");
		// Obs. pode ser dessa forma : super("Título da janela")
		
		
		//Criando um container para inserir componentes
		
		Container c = getContentPane();
		//Container c2 = new JPanel();
		
		//Criando layout da janela
		
		//BorderLayout border = new BorderLayout();
//		FlowLayout flow = new FlowLayout();
		
		
		GridLayout grid = new GridLayout(4,2);
		c.setLayout(grid);
		
		
		
		
		
		//Criando componentes
		
		JButton botao1 = new JButton("Botão 1");
		JButton botao2 = new JButton("Botão 2");
		JButton botao3 = new JButton("Botão 3");
		JButton botao4 = new JButton("Botão 4");
		JButton botao5 = new JButton("Botão 5");
		
		
		//Inseriri componentes no container
		
		//pelo border
		//c.add(BorderLayout.NORTH, botao1);
		//c.add(BorderLayout.SOUTH, botao2);
		//c.add(BorderLayout.CENTER, botao3);
		//c.add(BorderLayout.EAST, botao4);
		//c.add(BorderLayout.WEST, botao5);
		
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(botao5);
		
		
		
		
		
		//Montando a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
	
		new JanelaPD();
}
}
