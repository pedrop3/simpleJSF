package br.com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

//Controlador pagina JSF
@ApplicationScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	private List<String> nomes = new ArrayList<String>();
	
	private HtmlCommandButton commandButton;
	
	public String addNome(){
		nomes.add(nome);
		return ""; // JSF irá ficar na mesma pagina
	}
		
	public String addNomeDinamica(){
		nomes.add(nome);
		if (nomes.size() >= 3)
		{
			commandButton.setDisabled(true);
			//Força o redirecionamento da pagina 
			return "paginanavagada?faces-redirect=true";
		}
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
	
	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}
	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}
}
