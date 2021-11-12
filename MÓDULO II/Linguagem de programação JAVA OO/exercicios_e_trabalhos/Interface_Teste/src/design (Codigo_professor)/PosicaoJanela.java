package design;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PosicaoJanela extends JFrame implements ActionListener {
	
	public JLabel lbPesquisar;
	public JTextField tfPesquisar;
	public JButton btPesquisar;

	public PosicaoJanela() {
		super("Posição dos componentes no JFrame");
		
		// CRIANDO CONTAINER E ADICIONANDO UM LAYOUT A NOSSA JANELA
		Container c = getContentPane();
		c.setLayout(null); // Para especificar (x, y) de um componente devemos passar o layout como 'null'
		c.setBackground(Color.lightGray);
		
		// CRIANDO OS COMPONENTES
		// Formatando Fontes para adicionar mais tarde a nossos componentes
		Font fonte = new Font ("Arial", 0, 20); // (tipo da fonte, estilo da fonte, tamanho da fonte)
		// Criando uma Label
		lbPesquisar = new JLabel ("Buscador:");
		lbPesquisar.setFont(fonte); // adicionando nossa formatação a Label(lbPesquisar)
		lbPesquisar.setForeground(Color.white);
		 // Substitui .setSize(); e setLocation();
		lbPesquisar.setBounds(10, 20, 100, 30); // (X, Y, Largura, Altura)
		// Criando um JTextField
		tfPesquisar = new JTextField("");
		tfPesquisar.setFont(fonte);
		tfPesquisar.setBounds(120, 20, 200, 30);
		// Criando um JButton
		btPesquisar = new JButton("Pesquisar");
		btPesquisar.setFont(fonte);
		btPesquisar.setBounds(330, 20, 150, 30);
		
		// ADICIONANDO OS COMPONENTES A JANELA
		add(lbPesquisar);
		add(tfPesquisar);
		add(btPesquisar);
		
		// ADICIONANDO EVENTO AOS COMPONENTES
		btPesquisar.addActionListener(this);
		
		// MONTAGEM DA JANELA(função do X, tamanho, posição no monitor, visibilidade*)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 120);
		setLocationRelativeTo(this);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PosicaoJanela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btPesquisar) {
			String texto = "O texto pesquisado é: \n";
					texto += tfPesquisar.getText();
			JOptionPane.showMessageDialog(this, texto);
		}
		
	}

}
