package bancoPoupancaHerancaESobrecarga;

public class Poupanca extends Conta {

	public Poupanca(int numero) {
		super(numero);
	}
	
	public void rendeJuros() {
		float juros = getSaldo() * 0.01f;
		depositar(juros);
	}
}
