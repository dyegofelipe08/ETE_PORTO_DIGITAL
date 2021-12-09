import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Limpar {
	
	JTextField TfNome, TfSobrenome, TfCpf, TfEndereco, TfNumero, TfDataNasc, TfTel, TfEmail, TfRg,
  	 TfCidade, TfEstado, TfBairro, TfComplemento;
	
	public void LimparCampos() {
		
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
        JOptionPane.showMessageDialog(null, "Campos resetados!");
		
	}



}
