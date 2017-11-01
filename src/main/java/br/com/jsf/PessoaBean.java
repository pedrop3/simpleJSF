package br.com.jsf;

import javax.faces.bean.ManagedBean;

//Controlador pagina JSF
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	public String mostrarNome(){
		nomeCompleto = nome +" "+sobrenome;
		return ""; // JSF irá ficar na mesma pagina
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
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
}
