package bancoPoupancaHeranca;

public class Banco {

	private Conta[] contas;
	private int contadorDeContas;
	
	public Banco() {
		contas = new Conta[200]; 
		contadorDeContas = 0;
	}

	public boolean criarPoupanca(int numero) {
		for (Conta umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new Poupanca(numero);
		contadorDeContas++;
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

	public boolean renderJuros(int numConta) {
		Conta selecionada = null;
		for (Conta conta : contas) {
			if (conta != null && conta.getNumero() == numConta) {
				selecionada = conta;
				break;
			}
		}
		if (selecionada == null) {
			return false;
		}
		
		if (selecionada instanceof Poupanca) {
			Poupanca p = (Poupanca)selecionada;
			p.rendeJuros();
			return true;
		} else {
			return false;
		}
				
	}
}
