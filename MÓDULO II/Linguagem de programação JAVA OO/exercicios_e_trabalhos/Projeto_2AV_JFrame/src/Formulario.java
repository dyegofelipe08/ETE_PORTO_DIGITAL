
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

	JLabel LbTitulo, LbNome, LbSobrenome, LbCpf, LbEndereco, LbNumero, LbDataNasc, LbTel, LbEmail, LbRg, LbCidade,
			LbEstado, LbBairro, LbComplemento, LbCamposObrigatorios;
	JButton BtCadastrar, BtListar, BtLimpar, BtSair;
	JTextField TfNome, TfSobrenome, TfCpf, TfEndereco, TfNumero, TfDataNasc, TfTel, TfEmail, TfRg, TfCidade, TfEstado,
			TfBairro, TfComplemento;
	JTextArea TaListaDados;

	Pessoa pessoa = new Pessoa();

	public Formulario() {

		setTitle("Forumlário de cadastro");

		Container c = getContentPane();
		c.setLayout(null);
		Color cor1 = new Color(89, 135, 167);// forma de adicionar cor em RGB
		c.setBackground(cor1);

		Font fonteTituloTela = new Font("Comic Sans MS", 4, 20);
		Font fonteLb = new Font("Arial", 2, 16);
		Font fonteTf = new Font("Arial", 2, 16);
		Font fonteBt = new Font("Arial", 2, 20);
		Font fonteAst = new Font("Arial", 2, 11);

		LbTitulo = new JLabel("CADASTRO DE CLIENTES");
		LbTitulo.setFont(fonteTituloTela);
		LbTitulo.setForeground(Color.WHITE);
		LbTitulo.setBounds(290, 20, 350, 35);

		LbNome = new JLabel("Nome:*");
		LbNome.setBounds(20, 80, 60, 35);
		LbNome.setFont(fonteLb);
		LbNome.setForeground(Color.WHITE);

		TfNome = new JTextField("");
		TfNome.setBounds(90, 80, 200, 30);
		TfNome.setFont(fonteTf);

		LbSobrenome = new JLabel("Sobrenome:* ");
		LbSobrenome.setBounds(300, 80, 210, 35);
		LbSobrenome.setFont(fonteLb);
		LbSobrenome.setForeground(Color.WHITE);

		TfSobrenome = new JTextField(50);
		TfSobrenome.setBounds(400, 80, 400, 30);// afast linha horiz, afast cima/baixo, largura input, altura input
		TfSobrenome.setFont(fonteTf);

		LbDataNasc = new JLabel("Data de Nascimento: ");
		LbDataNasc.setBounds(20, 130, 200, 35);
		LbDataNasc.setFont(fonteLb);
		LbDataNasc.setForeground(Color.WHITE);

		TfDataNasc = new JTextField("");
		TfDataNasc.setBounds(180, 130, 110, 30);
		TfDataNasc.setFont(fonteTf);

		LbCpf = new JLabel("CPF:*");
		LbCpf.setBounds(300, 130, 60, 35);
		LbCpf.setFont(fonteLb);
		LbCpf.setForeground(Color.WHITE);

		TfCpf = new JTextField(14);
		TfCpf.setBounds(350, 130, 190, 30);
		TfCpf.setFont(fonteTf);

		LbRg = new JLabel("RG: ");
		LbRg.setBounds(550, 130, 40, 35);// afast linha horiz, afast cima/baixo, largura input, altura input
		LbRg.setFont(fonteLb);
		LbRg.setForeground(Color.WHITE);

		TfRg = new JTextField(10);
		TfRg.setBounds(585, 130, 216, 30);
		TfRg.setFont(fonteTf);

		LbEndereco = new JLabel("Endereço:");
		LbEndereco.setBounds(20, 180, 80, 35);
		LbEndereco.setFont(fonteLb);
		LbEndereco.setForeground(Color.WHITE);

		TfEndereco = new JTextField("");
		TfEndereco.setBounds(100, 180, 700, 30);
		TfEndereco.setFont(fonteTf);

		LbNumero = new JLabel("Numero:");
		LbNumero.setBounds(20, 230, 100, 35);
		LbNumero.setFont(fonteLb);
		LbNumero.setForeground(Color.WHITE);

		TfNumero = new JTextField("");
		TfNumero.setBounds(100, 230, 100, 30);
		TfNumero.setFont(fonteTf);

		LbComplemento = new JLabel("Complemento: ");
		LbComplemento.setBounds(230, 230, 120, 35);
		LbComplemento.setFont(fonteLb);
		LbComplemento.setForeground(Color.WHITE);

		TfComplemento = new JTextField("");
		TfComplemento.setBounds(350, 230, 120, 30);
		TfComplemento.setFont(fonteTf);

		LbBairro = new JLabel("Bairro: ");
		LbBairro.setBounds(500, 230, 150, 35);
		LbBairro.setFont(fonteLb);
		LbBairro.setForeground(Color.WHITE);

		TfBairro = new JTextField("");
		TfBairro.setBounds(560, 230, 241, 30);
		TfBairro.setFont(fonteTf);

		LbCidade = new JLabel("Cidade: ");
		LbCidade.setBounds(20, 280, 150, 35);
		LbCidade.setFont(fonteLb);
		LbCidade.setForeground(Color.WHITE);

		TfCidade = new JTextField("");
		TfCidade.setBounds(100, 280, 308, 30);
		TfCidade.setFont(fonteTf);

		LbEstado = new JLabel("Estado: ");
		LbEstado.setBounds(420, 280, 150, 35);
		LbEstado.setFont(fonteLb);
		LbEstado.setForeground(Color.WHITE);

		TfEstado = new JTextField("");
		TfEstado.setBounds(490, 280, 310, 30);
		TfEstado.setFont(fonteTf);

		LbTel = new JLabel("Contato:* ");
		LbTel.setBounds(20, 330, 160, 35);
		LbTel.setFont(fonteLb);
		LbTel.setForeground(Color.WHITE);

		TfTel = new JTextField("");
		TfTel.setBounds(100, 330, 310, 30);
		TfTel.setFont(fonteTf);

		LbEmail = new JLabel("E-mail:*");
		LbEmail.setBounds(420, 330, 160, 35);
		LbEmail.setFont(fonteLb);
		LbEmail.setForeground(Color.WHITE);

		TfEmail = new JTextField("");
		TfEmail.setBounds(490, 330, 310, 30);
		TfEmail.setFont(fonteTf);

		LbCamposObrigatorios = new JLabel("* campos de preenchimento obrigatório");
		LbCamposObrigatorios.setBounds(590, 380, 250, 35);
		LbCamposObrigatorios.setFont(fonteAst);
		LbCamposObrigatorios.setForeground(Color.WHITE);

		BtCadastrar = new JButton("Cadastrar");
		BtCadastrar.setBounds(30, 500, 150, 35);
		BtCadastrar.setFont(fonteBt);
		c.add(BtCadastrar);

		BtListar = new JButton("Listar");
		BtListar.setBounds(220, 500, 150, 35);
		BtListar.setFont(fonteBt);
		c.add(BtListar);

		BtLimpar = new JButton("Limpar");
		BtLimpar.setBounds(420, 500, 150, 35);
		BtLimpar.setFont(fonteBt);
		c.add(BtLimpar);

		BtSair = new JButton("Sair");
		BtSair.setBounds(620, 500, 150, 35);
		BtSair.setFont(fonteBt);
		BtSair.setForeground(Color.RED);
		c.add(BtSair);

		c.add(LbTitulo);
		c.add(LbNome);
		c.add(TfNome);
		c.add(LbSobrenome);
		c.add(TfSobrenome);
		c.add(LbDataNasc);
		c.add(TfDataNasc);
		c.add(LbCpf);
		c.add(TfCpf);
		c.add(LbRg);
		c.add(TfRg);
		c.add(LbEndereco);
		c.add(TfEndereco);
		c.add(LbNumero);
		c.add(TfNumero);
		c.add(LbComplemento);
		c.add(TfComplemento);
		c.add(LbBairro);
		c.add(TfBairro);
		c.add(LbCidade);
		c.add(TfCidade);
		c.add(LbEstado);
		c.add(TfEstado);
		c.add(LbTel);
		c.add(TfTel);
		c.add(LbEmail);
		c.add(TfEmail);
		c.add(LbCamposObrigatorios);

		BtCadastrar.addActionListener(this);
		BtListar.addActionListener(this);
		BtLimpar.addActionListener(this);
		BtSair.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pra quando o programa for fechado, ele parar de rodar.
		setSize(850, 650);
		setResizable(false);
		this.setLocationRelativeTo(null);// Inicializar o frame no centro da tela. Obs.: Setar a dimensão da tela antes.
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Saída",
						JOptionPane.YES_NO_OPTION);
				if (i == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					repaint();// método não está funcionando corretamente.
				}
			}
		});

	}

	public static void main(String[] args) {

		new Formulario();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == BtCadastrar) {

			pessoa.setNome(TfNome.getText());
			pessoa.setSobrenome(TfSobrenome.getText());
			pessoa.setCpf(TfCpf.getText());
			pessoa.setEndereco(TfEndereco.getText());
			pessoa.setNumero(TfNumero.getText());
			pessoa.setDataNascimento(TfDataNasc.getText());
			pessoa.setTelefone(TfTel.getText());
			pessoa.setEmail(TfEmail.getText());
			pessoa.setRg(TfRg.getText());
			pessoa.setCidade(TfCidade.getText());
			pessoa.setEstado(TfEstado.getText());
			pessoa.setBairro(TfBairro.getText());
			pessoa.setComplemento(TfComplemento.getText());
			pessoa.validarForm();
			pessoa.cadastrarPessoas();
			limparCampos();

		} else if (e.getSource() == BtListar) {
			JOptionPane.showMessageDialog(null, "Visualize os dados no console.");
			pessoa.listarDados();

		} else if (e.getSource() == BtLimpar) {

			limparCampos();
			JOptionPane.showMessageDialog(null, "Campos resetados!");

		} else if (e.getSource() == BtSair) {

			int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Saída",
					JOptionPane.YES_NO_OPTION);
			if (i == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else {
				repaint();
			}

		}

	}

	public void limparCampos() {
		TfNome.setText("");
		TfSobrenome.setText("");
		TfCpf.setText("");
		TfEndereco.setText("");
		TfNumero.setText("");
		TfDataNasc.setText("");
		TfTel.setText("");
		TfEmail.setText("");
		TfRg.setText("");
		TfCidade.setText("");
		TfEstado.setText("");
		TfBairro.setText("");
		TfComplemento.setText("");
	}

}
