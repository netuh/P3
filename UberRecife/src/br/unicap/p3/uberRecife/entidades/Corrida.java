package br.unicap.p3.uberRecife.entidades;

public class Corrida {

	private Passageiro passaRequ;
	private Motorista motoristAsso;
	private String origem;
	private String destino;
	private double valor;
	
	public Corrida(Passageiro p, Motorista m, String origem, String destino) {
		this.passaRequ = p;
		this.motoristAsso = m;
		this.origem = origem;
		this.destino = destino;
		valor = Math.random()*100;
		p.adicionarCorrida(this);
		m.adicionarCorrida(this);
	}
}
