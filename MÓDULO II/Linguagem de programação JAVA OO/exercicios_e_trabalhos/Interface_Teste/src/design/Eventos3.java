package design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Eventos3 extends JFrame {
	
	JLabel lb1;
	JLabel lbCor;
	
	public Eventos3() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Janela de Label");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		FlowLayout flow = new FlowLayout();
		c.setLayout(flow);
		
		// CRIANDO COMPONENTES
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		lb1 = new JLabel("Label de teste");
		lb1.setToolTipText("Meu label");
		lbCor = new JLabel("Label de teste 2");
		lbCor.setFont(fonte);
		lbCor.setForeground(Color.BLUE);
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(lb1);
		c.add(lbCor);
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Eventos3();		
	}
}
