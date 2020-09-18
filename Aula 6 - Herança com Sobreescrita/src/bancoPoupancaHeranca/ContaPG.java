package bancoPoupancaHeranca;

public class ContaPG extends Conta{

	public ContaPG(int numero) {
		super(numero);
	}
	
	public boolean sacarComImposto(float valor) {
		float valorReal = valor + valor*0.0001f;
		return saca(valorReal);
	}
	
	public void depositarComImposto(float valor) {
		float valorReal = valor - valor*0.0001f;
		depositar(valorReal);
	}

}
