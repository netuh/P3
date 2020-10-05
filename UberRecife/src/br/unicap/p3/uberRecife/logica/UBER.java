package br.unicap.p3.uberRecife.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.unicap.p3.uberRecife.entidades.Corrida;
import br.unicap.p3.uberRecife.entidades.Motorista;
import br.unicap.p3.uberRecife.entidades.Passageiro;
import br.unicap.p3.uberRecife.exceptions.MotoristaNaoDisponivel;
import br.unicap.p3.uberRecife.exceptions.PassageiroExistente;
import br.unicap.p3.uberRecife.exceptions.PassageiroNaoEncontrado;

public class UBER {

	private List<Passageiro> passageiros = new LinkedList<Passageiro>();
	private List<Motorista> motoristas = new ArrayList<Motorista>();
	private List<Corrida> corridas = new ArrayList<Corrida>();

	public void criaPassageiro(String nome, int telefone) throws PassageiroExistente {
		Passageiro p = encontraPassageiro(telefone);
		if (p != null) {
			throw new PassageiroExistente();
		}
		p = new Passageiro(nome, telefone);
		passageiros.add(p);
	}

	public void criaMotorista(String nome, int telefone, String placa, String modelo) throws PassageiroExistente {
		Motorista m = new Motorista(nome, telefone, placa, modelo);
		for (Motorista umMotorista : motoristas) {
			if( m.compara(umMotorista)) {
				throw new PassageiroExistente();
			}
		}
		motoristas.add(m);
	}

	public void criaCorrida(int telefone, String origem, String destino) throws PassageiroNaoEncontrado, MotoristaNaoDisponivel {
		Passageiro p = encontraPassageiro(telefone);
		if (p == null) {
			throw new PassageiroNaoEncontrado();
		}
		Motorista m = null;
		
		for (Motorista umMoto : motoristas) {
			if (umMoto.isDisponivel()) {
				m = umMoto;
				m.setDisponivel(false);
				break;
			}
		}
		if (m == null) {
			throw new MotoristaNaoDisponivel();
		}
		
		Corrida c = new Corrida (p,m, origem, destino);
		corridas.add(c);
	}

	private Passageiro encontraPassageiro(int telefone) {
		for (Passageiro umPassag : passageiros) {
			if (umPassag.getTelefone() == telefone) {
				return umPassag;
			}
		}
		return null;
	}
	
	
}
