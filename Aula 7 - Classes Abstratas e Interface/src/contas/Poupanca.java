package contas;

public class Poupanca extends ContaCorrente {

	public Poupanca(int numero) {
		super(numero);
	}
	
	public void rendeJuros() {
		float juros = getSaldo() * 0.01f;
		depositar(juros);
	}
}
