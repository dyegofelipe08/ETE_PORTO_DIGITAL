import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	private String numero;
	private String dataNascimento;
	private String telefone;
	private String email;
	private String rg;
	private String cidade;
	private String estado;
	private String bairro;
	private String complemento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void validarForm() {
		if (this.getNome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo nome!"); 
		}
		else if(this.getSobrenome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Sobrenome!"); 
		}
		else if(this.getCpf().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo CPF!"); 
		}
		else if(this.getEndereco().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Endereço!"); 
		}
		else if(this.getNumero().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Número!"); 
		}
		else if(this.getDataNascimento().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Data de nascimento!"); 
		}
		else if(this.getTelefone().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Telefone!"); 
		}
		else if(this.getEmail().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo E-mail!"); 
		}
		else if(this.getRg().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo RG!"); 
		}
		else if(this.getCidade().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Cidade!"); 
		}
		else if(this.getEstado().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Estado!"); 
		}
		else {
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!"); 
		}
	
	}
	public void cadastarPessoa() {
		
	}
}
