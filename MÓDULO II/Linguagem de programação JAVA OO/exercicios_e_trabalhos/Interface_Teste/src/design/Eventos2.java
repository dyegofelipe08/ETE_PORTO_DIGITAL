package design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Eventos2 extends JFrame {
	
	JLabel label1;
	
	public Eventos2() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Janela de Label");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		FlowLayout flow = new FlowLayout();
		c.setLayout(flow);
		
		// CRIANDO COMPONENTES
		label1 = new JLabel("Label de teste");
		label1.setToolTipText("Meu label");
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(label1);
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Eventos2();		
	}
}
