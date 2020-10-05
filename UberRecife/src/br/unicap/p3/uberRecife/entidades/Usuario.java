package br.unicap.p3.uberRecife.entidades;

public abstract class Usuario {

	private String nome;
	private int telefone;
	private float pontos;
	
	public Usuario(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
		pontos = 0.0f;
	}
	
	public int getTelefone() {
		return telefone;
	}
}
