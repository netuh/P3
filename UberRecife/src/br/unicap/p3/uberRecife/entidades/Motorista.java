package br.unicap.p3.uberRecife.entidades;

import java.util.LinkedList;
import java.util.List;

public class Motorista extends Usuario{

	private String placaCarro;
	private String modeloCarro;
	private List<Corrida> corridas = new LinkedList<Corrida>();
	private boolean disponivel;
	
	public Motorista(String nome, int telefone, String placaCarro, String modeloCarro) {
		super (nome, telefone);
		this.placaCarro = placaCarro;
		this.modeloCarro = modeloCarro;
		disponivel = true;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean b) {
		disponivel = b;
	}

	public void adicionarCorrida(Corrida c) {
		corridas.add(c);
	}

	public boolean compara(Motorista m) {
		return m.getPlaca().equals(this.getPlaca())|| m.getTelefone() == this.getTelefone();
	}

	private String getPlaca() {
		return placaCarro;
	}
}
