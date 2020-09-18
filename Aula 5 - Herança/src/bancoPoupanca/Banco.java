package bancoPoupanca;

public class Banco {

	private Conta[] contas;
	private Poupanca[] poupancas;
	private int contadorDeContas;
	private int contadorDePoupancas;
	
	public Banco() {
		contas = new Conta[100];
		poupancas = new Poupanca[100]; 
		contadorDeContas = 0;
		contadorDePoupancas = 0;
	}

	public boolean criarPoupanca(int numero) {
		for (Poupanca umaPoupanca : poupancas) {
			if (umaPoupanca != null && umaPoupanca.getNumero() == numero) {
				return false;
			}
		}
		poupancas[contadorDePoupancas] = new Poupanca(numero);
		contadorDePoupancas++;
		return true;
		
	}
	
	public boolean criarConta(int numero) {
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
