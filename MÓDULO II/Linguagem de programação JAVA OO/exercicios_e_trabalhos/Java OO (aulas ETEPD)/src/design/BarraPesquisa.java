package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BarraPesquisa extends JFrame implements ActionListener {
	
	JButton btPesquisar;
	JLabel lbTexto;
	JTextField tfCaixaTesto;

	
	public BarraPesquisa() {
		
		super("Pesquisa");
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.black);
		
		Font fonte = new Font ("Arial",3,15);
		
		
		lbTexto = new JLabel ("Digite o que deseja pesquisar: ");
		lbTexto.setFont(fonte);
		lbTexto.setForeground(Color.gray);
		lbTexto.setBounds(10, 20, 250, 30);
		
		tfCaixaTesto = new JTextField("");
		tfCaixaTesto.setFont(fonte);
		tfCaixaTesto.setBounds(230, 20, 340, 30);
		
		
		btPesquisar = new JButton ("Pesquisar");
		btPesquisar.setFont(fonte);
		btPesquisar.setForeground(Color.gray);
		btPesquisar.setBounds(225, 70, 150, 30);
		
		
		c.add(lbTexto);
		c.add(tfCaixaTesto);
		c.add(btPesquisar);
		
		btPesquisar.addActionListener(this);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,150);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		new BarraPesquisa();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btPesquisar) {
			String texto = "Você pesquisou o seguinte texto: \n";
			texto += tfCaixaTesto.getText();
			JOptionPane.showMessageDialog(this,texto);
		}
		
		
	}

}
