package principal;
//minha class de cadastros de destino.
public class DesafioDestino {	
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private String pagamento;
	private String estado;
	private String cep;
	
	
	
	public DesafioDestino(int id, String nome, String sobrenome, String email, String pagamento, String estado,String cep
		) {
	
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.pagamento = pagamento;
		this.estado = estado;
		this.cep = cep;
	}
	
	

	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public DesafioDestino() {
		
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
