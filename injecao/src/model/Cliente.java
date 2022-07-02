package model;

public class Cliente {
	
	private String nome;
	private boolean ativo = false;
	
	public Cliente(String nome, boolean ativo) {
		this.nome = nome;
		this.ativo = ativo;
	}
	
	public Cliente() {};
	
	public void ativar() {
		this.ativo = true;
	}
	
	public void inativar() {
		this.ativo = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
