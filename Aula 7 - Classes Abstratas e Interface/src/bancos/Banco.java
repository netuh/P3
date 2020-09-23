package bancos;
import contas.ContaCorrente;
import contas.ContaGeral;
import contas.ContaPG;
import contas.Poupanca;

public class Banco implements BancoGenerico{

	private ContaGeral[] contas;
	private int contadorDeContas;
	
	public Banco() {
		contas = new ContaGeral[200]; 
		contadorDeContas = 0;
	}

	public boolean criarPoupanca(int numero) {
		for (ContaGeral umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new Poupanca(numero);
		contadorDeContas++;
		return true;
	}
	
	public boolean criarContaPG(int numero) {
		for (ContaGeral umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new ContaPG(numero);
		contadorDeContas++;
		return true;
	}
	
	public boolean criarConta(int numero) {
		for (ContaGeral umaConta : contas) {
			if (umaConta != null && umaConta.getNumero() == numero) {
				return false;
			}
		}
		contas[contadorDeContas] = new ContaCorrente(numero);
		contadorDeContas++;
		return true;
		
	}
	
	public boolean depositar(int numero, float valor) {
		ContaGeral selecionada = null;
		for (ContaGeral conta : contas) {
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
		ContaGeral selecionada = null;
		for (ContaGeral conta : contas) {
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
		ContaGeral selecionada = null;
		for (ContaGeral conta : contas) {
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

	@Override
	public int numContas() {
		return contadorDeContas;
	}

	@Override
	public float saldoTotal() {
		return 110000;
	}
}
