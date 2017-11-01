package br.com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

//Controlador pagina JSF
@ApplicationScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	private List<String> nomes = new ArrayList<String>();
	
	
	public String addNome(){
		nomes.add(nome);
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

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
}
