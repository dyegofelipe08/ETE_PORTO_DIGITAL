import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormularioTeste extends JFrame {
	
	JLabel LbTitulo;

	public FormularioTeste() {
		
		//setTitle("Formulário Teste");
		super("Formulário Teste");
		
		Container c = getContentPane();
		c.setLayout(null);
		Color cor1 = new Color(0,55,82);
		c.setBackground(cor1);
		
		Font tituloPrincipal = new Font("Calibri",4, 20);
		
		
		LbTitulo = new JLabel("Cadastro de Clientes");
		LbTitulo.setBounds(400, 20, 200,35);
		LbTitulo.setForeground(Color.white);
		LbTitulo.setFont(tituloPrincipal);
		
		JButton Bt1 = new JButton ("teste");
		Bt1.setBounds(400, 80, 30, 20);
		
		
		
		
		
		
		
		
		
		
		
		
		c.add(LbTitulo);
		c.add(Bt1);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pra quando o programa for fechado, ele parar de rodar.
		setSize(850, 650);
		setResizable(false); 
		this.setLocationRelativeTo(null);// Inicializar o frame no centro da tela. Obs.:Setar a dimensão da tela antes.
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		new FormularioTeste();

	}

}
