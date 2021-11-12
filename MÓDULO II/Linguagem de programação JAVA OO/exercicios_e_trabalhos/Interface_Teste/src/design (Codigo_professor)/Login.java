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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JLabel lbUsuario;
	JLabel lbPassaword;
	JTextField tfUsuario;
	JPasswordField tfPassword;
	JButton btLogar;
	JButton btCancelar;
	
	public Login() {
		// SETANDO UM TÍTULO PARA A NOSSA JANELA PRINCIPAL
		super("Janela de Login");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		GridLayout grid = new GridLayout(3,3);
		c.setLayout(grid);
		
		// CRIANDO COMPONENTES
		Font fonte = new Font("Fira Code", Font.BOLD | Font.ITALIC, 16);
		lbUsuario = new JLabel("Usuário:");
		lbPassaword = new JLabel("Password:");
		lbUsuario.setFont(fonte);
		lbPassaword.setFont(fonte);
		lbUsuario.setForeground(Color.BLUE);
		lbPassaword.setForeground(Color.BLUE);
		tfUsuario = new JTextField();
		tfPassword = new JPasswordField();
		btLogar = new JButton("OK");
		btCancelar = new JButton("Cancelar");
		
		// SETANDO O OBJETO QUE IRÁ RECEBER A AÇÃO
		btLogar.addActionListener(this); // 'this' => objeto que está chamando o evento
		btCancelar.addActionListener(this);
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(lbUsuario);
		c.add(tfUsuario);
		c.add(lbPassaword);
		c.add(tfPassword);
		c.add(btLogar);
		c.add(btCancelar);
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(null);
		/* Este deve ser o último método a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Login();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btLogar) {
			String s = "Usuário: " + tfUsuario.getText() + 
					"\nPassword: " + new String(tfPassword.getPassword());
			JOptionPane.showMessageDialog(null, s);
		} else if (e.getSource() == btCancelar) {
			tfUsuario.setText("");
			tfPassword.setText("");
		}
	}
}
