package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JanelaExerc04Nov extends JFrame implements ActionListener{
	
	JButton bt1;
	JButton bt2;
	JButton bt3;
	JButton bt4;
	
	
	public JanelaExerc04Nov() {
		
		super("Exerc�cio 04 de novembro");
		
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(2,2);
		c.setLayout(grid);
		
	
		c.add(bt1 = new JButton("Bot�o 1"));
		c.add(bt2 = new JButton("Bot�o 2"));
		c.add(bt3 = new JButton("Bot�o 3"));
		c.add(bt4 = new JButton("Bot�o 4"));
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(800,600);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new JanelaExerc04Nov();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==bt1) {
			JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o 1");
			bt1.setText("J� utilizado");
			bt1.setBackground(Color.blue);
			bt1.setForeground(Color.red);
		} else if (e.getSource()==bt2) {
			JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o 2");
			bt2.setText("J� utilizado");
			bt2.setBackground(Color.cyan);
			bt2.setForeground(Color.black);
		}else if (e.getSource()==bt3) {
			JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o 3");
			bt3.setText("J� utilizado");
			bt3.setBackground(Color.green);
			bt3.setForeground(Color.gray);
		}else if (e.getSource()==bt4) {
			JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o 4");
			bt4.setText("J� utilizado");
			bt4.setBackground(Color.black);
			bt4.setForeground(Color.white);
		}
		
	}

}
