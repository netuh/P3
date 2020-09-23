package executar;

import contas.ContaCorrente;
import contas.ContaGeral;
import contas.ContaPG;
import contas.Poupanca;

public class Principal {

	public static void main(String[] args) {
		ContaGeral cc = new ContaCorrente(1);
		cc.depositar(100);
		cc.sacar(50);
		System.out.println("o saldo é "+cc.getSaldo());
		
		cc = new ContaPG(1);
		cc.depositar(100);
		cc.sacar(50);
		System.out.println("o saldo é "+cc.getSaldo());
		
		
		cc = new Poupanca(1);
		cc.depositar(100);
		cc.sacar(50);
		System.out.println("o saldo é "+cc.getSaldo());
	}
}
