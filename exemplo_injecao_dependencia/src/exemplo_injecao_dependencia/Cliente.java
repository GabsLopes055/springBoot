package exemplo_injecao_dependencia;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void ativar() {
		this.ativo = true;
	}
	
	public Cliente(String nome, String email, boolean ativo, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.ativo = ativo;
	}
	
}
