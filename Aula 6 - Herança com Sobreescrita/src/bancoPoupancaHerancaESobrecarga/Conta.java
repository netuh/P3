package bancoPoupancaHerancaESobrecarga;

public class Conta {

	private int numero;
	private float saldo;
	
	public Conta (int numero) {
		this.numero = numero;
		saldo = 0;
	}
	
	public void depositar(float valor) {
		saldo += valor;
		//saldo = saldo + valor;
	}
	
	public boolean sacar (float valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		//saldo = saldo - valor;
		return true;
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
}
