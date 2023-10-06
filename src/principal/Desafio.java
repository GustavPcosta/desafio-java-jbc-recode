package principal;

import java.util.Date;

//minha classe de usuário.
public class Desafio {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private Date dataCadastro;
	
	
	
	
	
	public Desafio(int id, String nome, String email, String senha, String confirm_senha,Date dataCadastro) {
	
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
	}
	

	



	public Date getDataCadastro() {
		return dataCadastro;
	}



	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	public Desafio() {
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	






	public void add(Desafio usuario) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
