package br.unicap.p3.uberRecife.entidades;

import java.util.LinkedList;
import java.util.List;

public class Passageiro extends Usuario{

	private List<Corrida> corridas = new LinkedList<Corrida>();
	
	public Passageiro(String nome, int telefone) {
		super(nome, telefone);
	}

	public void adicionarCorrida(Corrida c) {
		corridas.add(c);
	}
}
