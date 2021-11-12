
package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame implements ActionListener {

	JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, soma, sub, mult, div, resul;

	JLabel tela;

	public Calculadora() {

		setTitle("CALCULADORA - ETEPD");

		// super("Calculadora - ETEPD"); -> Outra forma de adicionar título à janela.

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.DARK_GRAY);
		Font fonteTela = new Font("Arial", 2,35);
		Font fonteBt = new Font("Arial", 2,20);
		
		tela = new JLabel("0");
		tela.setFont(fonteTela);
		tela.setForeground(Color.white);
		tela.setBounds(10, 20, 320, 80);
		
		
		soma = new JButton("+");
		soma.setFont(fonteBt);
		soma.setBounds(2, 150, 84, 50);
		
		sub = new JButton("-");
		sub.setFont(fonteBt);
		sub.setBounds(88, 150, 84, 50);
		
		mult = new JButton("X");
		mult.setFont(fonteBt);
		mult.setBounds(174, 150, 84, 50);
		
		div = new JButton("/");
		div.setFont(fonteBt);
		div.setBounds(260, 150, 84, 50);
		
		n1 = new JButton("1");
		n1.setFont(fonteBt);
		n1.setBounds(2, 202, 84, 50);
		
		n2 = new JButton("2");
		n2.setFont(fonteBt);
		n2.setBounds(88, 202, 84, 50);
		
		n3 = new JButton("3");
		n3.setFont(fonteBt);
		n3.setBounds(174, 202, 84, 50);
		
		n4 = new JButton("4");
		n4.setFont(fonteBt);
		n4.setBounds(260, 202, 84, 50);
		
		n5 = new JButton("5");
		n5.setFont(fonteBt);
		n5.setBounds(2, 254, 84, 50);
		
		n6 = new JButton("6");
		n6.setFont(fonteBt);
		n6.setBounds(88, 254, 84, 50);
		
		n7 = new JButton("7");
		n7.setFont(fonteBt);
		n7.setBounds(174, 254, 84, 50);
		
		n8 = new JButton("8");
		n8.setFont(fonteBt);
		n8.setBounds(260, 254, 84, 50);
		
		n9 = new JButton("9");
		n9.setFont(fonteBt);
		n9.setBounds(2, 306, 84, 50);
		
		
		n0 = new JButton("0");
		n0.setFont(fonteBt);
		n0.setBounds(88, 306, 84, 50);
		
		resul = new JButton("=");
		resul.setFont(fonteBt);
		resul.setBounds(174, 306, 170, 50);
		
		
		c.add(tela);
		c.add(soma);
		c.add(sub);
		c.add(mult);
		c.add(div);
		c.add(n1);
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		c.add(n7);
		c.add(n8);
		c.add(n9);
		c.add(n0);
		c.add(resul);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(362, 400);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Calculadora();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
