package Interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Pratica01 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		int filhos = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos você tem? "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura(metros): "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso(kg): "));
		double imc = peso / Math.pow(altura, 2);
		BigDecimal bd = new BigDecimal(imc).setScale(2, RoundingMode.HALF_EVEN);
		JOptionPane
				.showMessageDialog(null,
						"NOME: " + nome + "\nIDADE: " + idade + "\nQTD FILHOS: " + filhos + "\nALTURA: " + altura
								+ "\nPESO: " + peso + "\nIMC: " + bd.doubleValue(),
						"Dados", JOptionPane.INFORMATION_MESSAGE);

	}

}
