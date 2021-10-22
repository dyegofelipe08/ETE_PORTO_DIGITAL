package Interfaces;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		int resultado = n1*n2;
		JOptionPane.showMessageDialog(null, "O resultado de "+n1+" x "+n2+" é: "+resultado, "Multiplicação",JOptionPane.INFORMATION_MESSAGE);
	}

}
