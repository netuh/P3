package contas;

import exceptions.SaldoInsuficienteException;

public class ContaPG  extends ContaGeral{
	
	public ContaPG(int numero) {
		super(numero);
	}

	@Override
	public void depositar(float valor) {
		float saldo = getSaldo();
		float desconto = valor*0.0001f;
		setSaldo(saldo+valor-desconto);
		
	}

	@Override
	public void sacar(float valor) throws SaldoInsuficienteException {
		Float saldo = getSaldo();
		float desconto = valor*0.0001f;
		if (valor+desconto > saldo) {
			throw new SaldoInsuficienteException();
		}
		setSaldo(saldo - valor - desconto);
	}
}
