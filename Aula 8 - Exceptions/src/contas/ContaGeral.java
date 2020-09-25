package contas;

import exceptions.SaldoInsuficienteException;

public abstract class ContaGeral {

	private int numero;
	private float saldo;
	
	public ContaGeral (int numero) {
		this.numero = numero;
		saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float novoSaldo) {
		saldo = novoSaldo;
	}
	
	public abstract void depositar (float valor);
	
	public abstract void sacar (float valor) throws SaldoInsuficienteException;
}
