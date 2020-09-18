package bancoPoupanca;

public class Poupanca {

	private int numero;
	private float saldo;
	
	public Poupanca (int numero) {
		this.numero = numero;
		saldo = 0;
	}
	
	public void deposita(float valor) {
		saldo += valor;
		//saldo = saldo + valor;
	}
	
	public boolean saca (float valor) {
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
	
	public void rendeJuros() {
		saldo += saldo*0.01;
	}
}
