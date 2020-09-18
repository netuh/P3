package bancoPoupancaHerancaESobrecarga;

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
	
	public boolean criarContaPG(int numero) {
		for (Conta umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new ContaPG(numero);
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
		selecionada.depositar(valor);
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
		return selecionada.sacar(valor);
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
	
	public static void main(String[] args) {
		ContaPG c = new ContaPG(123);
		//Conta c = new Poupanca(123);
		c.depositar(100);
		c.sacar(50);
		c.sacar(50, 0.005f);
		// operador de +
		int i = 3+4;
		System.out.println("O saldo de c é "+c.getSaldo());
	}
}
