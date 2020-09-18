package basico;

public class Banco {

	private Conta[] contas;
	private int contadorDeContas;
	
	public Banco() {
		contas = new Conta[100];
		contadorDeContas = 0;
	}
	
	public boolean criarConta(int numero) {

		// for normal
//		for (int i = 0; i < contas.length; i++) {
//			Conta conta = contas[i];
		//for each
		for (Conta umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new Conta(numero);
		contadorDeContas++;
		return true;
		
	}
	
	public boolean depositar(int numero, float valor) {
		Conta selecionada = null;
		for (Conta conta : contas) {
			if (conta != null && conta.getNumero() == numero) {
				selecionada = conta;
				break;
			}
		}
		if (selecionada == null) {
			return false;
		}
		selecionada.deposita(valor);
		return true;
		
	}
	
	public boolean sacar(int numero, float valor) {
		Conta selecionada = null;
		for (Conta conta : contas) {
			if (conta != null && conta.getNumero() == numero) {
				selecionada = conta;
				break;
			}
		}
		if (selecionada == null) {
			return false;
		}
		return selecionada.saca(valor);
		
	}
}
