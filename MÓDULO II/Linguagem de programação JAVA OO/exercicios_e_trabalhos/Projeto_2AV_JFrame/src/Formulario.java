import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame {
	
	JLabel LbTitulo,LbNome, LbSobrenome, LbCpf, LbEndereco, LbNumero, LbTel, LbEmail;
	JButton BtCadastrar, BtListar, BtLimpar, BtSair;
	JTextField TfNome, TfSobrenome;
	
	public Formulario() {
		
		setTitle("Forumlário de cadastro");
		
		Container c = getContentPane();
		c.setLayout(null);
		Color cor1 = new Color(89,135,167);// forma de adicionar cor em RGB
		c.setBackground(cor1);
		
		Font fonteTituloTela = new Font("Comic Sans MS", 4, 20);
		Font fonteLb = new Font("Arial", 2,16);
		Font fonteTf = new Font("Arial", 2,16);
		Font fonteBt = new Font("Arial", 2,20);
		
		LbTitulo = new JLabel("CADASTRO DE CLIENTES");
		LbTitulo.setFont(fonteTituloTela);
		LbTitulo.setForeground(Color.WHITE);
		LbTitulo.setBounds(260, 20, 350, 35);
		
		LbNome = new JLabel("Nome:");
		LbNome.setBounds(20, 80, 50, 35);
		LbNome.setFont(fonteLb);
		LbNome.setForeground(Color.WHITE);
		
		LbSobrenome = new JLabel("Sobrenome:");
		LbSobrenome.setBounds(400, 80, 200, 35);
		LbSobrenome.setFont(fonteLb);
		LbSobrenome.setForeground(Color.WHITE);
		
		
		
		
		
		
		
		
		
		
		TfNome = new JTextField("");
		TfNome.setBounds(80, 80, 200, 30);
		TfNome.setFont(fonteTf);
		
		
		
		
		
		
		
		
		
		
		
		LbCpf = new JLabel("CPF:");
		LbEndereco = new JLabel("Endereço:");
		LbNumero = new JLabel("Numero:");
		LbTel = new JLabel("Contato:");
		LbEmail = new JLabel("E-mail:");
		
		c.add(LbTitulo);
		c.add(LbNome);
		c.add(LbSobrenome);
		c.add(TfNome);
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pra quando o programa for fechado, ele parar de rodar.
		setSize(850, 650);
		setResizable(false); 
		this.setLocationRelativeTo(null);// Inicializar o frame no centro da tela. Obs.:Setar a dimensão da tela antes.
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		new Formulario();
	}

}
