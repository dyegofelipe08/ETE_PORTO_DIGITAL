package Interfaces;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));
		int resultado = n1*n2;
		JOptionPane.showMessageDialog(null, "O resultado de "+n1+" x "+n2+" �: "+resultado, "Multiplica��o",JOptionPane.INFORMATION_MESSAGE);
	}

}
