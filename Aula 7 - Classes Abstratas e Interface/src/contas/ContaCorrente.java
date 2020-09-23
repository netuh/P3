package contas;

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
	public boolean sacar(float valor) {
		Float saldo = getSaldo();
		if (valor > saldo) {
			return false;
		}
		setSaldo(saldo-valor);
		return true;
	}
}
