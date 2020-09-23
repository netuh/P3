package contas;

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
	public boolean sacar(float valor) {
		Float saldo = getSaldo();
		float desconto = valor*0.0001f;
		if (valor+desconto > saldo) {
			return false;
		}
		setSaldo(saldo - valor - desconto);
		return true;
	}
}
