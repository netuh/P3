package bancoPoupancaHerancaESobrecarga;

public class ContaPG extends Conta{

	public ContaPG(int numero) {
		super(numero);
	}
	
	@Override
	public boolean sacar(float valor2) {
		float valorReal = valor2 + valor2*0.0001f;
		return super.sacar(valorReal);
	}

	public boolean sacar(float valor, float percentualImposto) {
		float valorReal = valor + valor*percentualImposto;
		return super.sacar(valorReal);
	}

	@Override
	public void depositar(float valor) {
		float valorReal = valor - valor*0.0001f;
		super.depositar(valorReal);
	}

}
