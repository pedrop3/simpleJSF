package br.com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

import br.com.jsf.dao.DaoGeneric;
import br.com.jsf.entidades.Pessoa;

//Controlador pagina JSF
@ApplicationScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	private DaoGeneric<Pessoa> daoGeneric = new DaoGeneric<Pessoa>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	
	public String salvar(){
		pessoa = daoGeneric.merge(pessoa);
		carregaPessoa();
		return "";
	}

	public String novo()
	{
		pessoa = new Pessoa();
		return "";
	}
	
	public String remove(){
		daoGeneric.deletePorID(pessoa);
		pessoa = new Pessoa();
		carregaPessoa();
		return"";
	}
	
	//Forçar carregamento ao abrir a tela
	@PostConstruct
	public void carregaPessoa(){
		pessoas = daoGeneric.getListEntity(Pessoa.class);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public DaoGeneric<Pessoa> getDaoGeneric() {
		return daoGeneric;
	}


	public void setDaoGeneric(DaoGeneric<Pessoa> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	
}
