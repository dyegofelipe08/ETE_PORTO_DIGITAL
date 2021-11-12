package design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos extends JFrame implements ActionListener {
	
	public Eventos() {
		// SETANDO UM T�TULO PARA A NOSSA JANELA PRINCIPAL
		super("Janela de Eventos");
		
		// CRIANDO UM CONTAINER PARA INSERIR NOSSOS COMPONENTES
		Container c = getContentPane();
		
		// CRIANDO UM LAYOUT PARA NOSSA JANELA
		GridLayout grid = new GridLayout(4, 1); // Par�metros => (qtd linhas, qtd colunas)
		c.setLayout(grid);
		
		// CRIANDO COMPONENTES
		JButton botao1 = new JButton("Clique aqui");

		// SETANDO O OBJETO QUE IR� RECEBER A A��O
		botao1.addActionListener(this); // 'this' => objeto que est� chamando o evento
		
		// INSERINDO COMPONENTES NO CONTAINER
		c.add(botao1);

		// CRIANDO E INSERINDO COMPONENTES NO CONTAINER
//		c.add(new JButton("Clique aqui"));
		
		// MONTANDO A NOSSA JANELA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		/* Este deve ser o �ltimo m�todo a ser executado em nossa janela */
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Eventos();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Voc� clicou!");
	}

}
