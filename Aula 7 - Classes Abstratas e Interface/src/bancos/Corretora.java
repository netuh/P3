package bancos;

import contas.ContaCorrente;

public class Corretora implements BancoGenerico{

	ContaCorrente[] contas = new ContaCorrente[100];
	
	
	public Corretora(){
		for (int i = 0; i < contas.length; i++) {
			contas[i] =  new ContaCorrente(i);
			contas[i].depositar(100);
		}
	}


	@Override
	public int numContas() {
		return 100;
	}


	@Override
	public float saldoTotal() {
		return 100000;
	}
}
