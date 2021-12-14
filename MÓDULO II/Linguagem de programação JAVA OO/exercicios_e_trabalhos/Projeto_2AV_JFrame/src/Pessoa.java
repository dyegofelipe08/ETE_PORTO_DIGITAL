import java.util.ArrayList;

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
	ArrayList<String> listaDeDados = new ArrayList<String>();
	ArrayList<String> listaTotal = new ArrayList<String>();
	private String Dados;
	
	
	public Pessoa() {

	}

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
	public String getDados() {
		return Dados;
	}
	public void setDados(String Dados) {
		this.Dados = Dados;
	}

	
	public void validarForm() {
		if (this.getNome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo nome!");
		} else if (this.getSobrenome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Sobrenome!");
		} else if (this.getCpf().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo CPF!");
		} else if (this.getTelefone().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo Contato!");
		} else if (this.getEmail().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha o campo E-mail!");
		} else {
			JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
		}

	}

	public void cadastrarPessoas() {
		
		listaDeDados.add("------------------------------------------");
		listaDeDados.add("Nome: " + this.getNome());
		listaDeDados.add("Sobrenome: "+this.getSobrenome());
		listaDeDados.add("CPF: "+this.getCpf());
		listaDeDados.add("RG: "+this.getRg());
		listaDeDados.add("Data de nacimento: "+this.getDataNascimento());
		listaDeDados.add("Endereço: "+this.getEndereco());
		listaDeDados.add("Nº: "+this.getNumero());
		listaDeDados.add("Cidade: "+this.getCidade());
		listaDeDados.add("Bairro "+this.getBairro());
		listaDeDados.add("Estado: "+this.getEstado());
		listaDeDados.add("Complemento "+this.getComplemento());
		listaDeDados.add("Telefone: "+this.getTelefone());
		listaDeDados.add("E-mail: "+this.getEmail());
		listaDeDados.add("------------------------------------------");

	}

	public void listarDados() {

		for (String dados : listaDeDados) {
		
				System.out.println(dados);

		}
		
		
	}
}