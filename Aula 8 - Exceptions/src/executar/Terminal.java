package executar;

import contas.ContaCorrente;
import contas.ContaGeral;
import contas.ContaPG;
import contas.Poupanca;
import exceptions.SaldoInsuficienteException;

public class Terminal{

	public static void main(String[] args) {
		ContaGeral cc = new ContaCorrente(1);
		//cc.depositar(100);
		try {
			cc.sacar(50);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("o saldo é "+cc.getSaldo());
		
	}
}
