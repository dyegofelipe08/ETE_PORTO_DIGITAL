package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventosPD extends JFrame implements ActionListener {
	
	JButton botao1;
	JButton botao2;
	JButton botao3;
	JButton botao4;
	JTextField tfMensagem;
	
	public EventosPD() {
		super("Eventos");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// CRIANDO COMPONENTES
		botao1 = new JButton("Confirmar");
		botao2 = new JButton("Cancelar");
		botao3 = new JButton("kkkkj");
		botao4 = new JButton("Quarto");
		tfMensagem = new JTextField("aaaa");
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(botao1);
		c.add(botao2);
		c.add(botao3);
		c.add(botao4);
		c.add(tfMensagem);
		
		// SETANDO O OBJETO QUE IRÁ RECEBER A AÇÃO
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		botao3.addActionListener(this);
		botao4.addActionListener(this);
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new EventosPD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao1) {
			JOptionPane.showMessageDialog(null, "Você clicou no Confirmar e estava escrito na sua mensagem: "
					+ "\n" + tfMensagem.getText());
			botao1.setText("CONFIRMADO");
			botao1.setForeground(Color.RED);
		} else if (e.getSource() == botao2) {
			JOptionPane.showMessageDialog(null, "Você clicou no Cancelar");
		} else if (e.getSource() == botao3) {
			JOptionPane.showMessageDialog(null, "Você clicou no botão kk");
		} else if (e.getSource() == botao4) {
			JOptionPane.showMessageDialog(null, "Você clicou no quarto botão :)");
		}
		
	}

}
