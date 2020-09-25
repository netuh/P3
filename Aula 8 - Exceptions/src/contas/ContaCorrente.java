package contas;

import exceptions.SaldoInsuficienteException;

public class ContaCorrente extends ContaGeral{

	public ContaCorrente(int numero) {
		super(numero);
	}

	@Override
	public void depositar(float valor) {
		Float saldo = getSaldo();
		setSaldo(saldo+valor);
		
	}

	@Override
	public void sacar(float valor) throws SaldoInsuficienteException {
		Float saldo = getSaldo();
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		setSaldo(saldo-valor);
	}
}
