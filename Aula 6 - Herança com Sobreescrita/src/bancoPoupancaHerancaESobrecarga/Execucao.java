package bancoPoupancaHerancaESobrecarga;

import java.util.Scanner;

public class Execucao {

	static Scanner s  = new Scanner(System.in);
	
	public static void main(String[] args) {
		Banco b = new Banco();
		int escolha, numConta;
		float valor;
		do {
			System.out.println("digite o que deseja");
			escolha = s.nextInt();
			switch (escolha) {
			case 1: {
				System.out.println("digite numero da conta");
				numConta = s.nextInt();
				b.criarConta(numConta);
				break;
			}
			case 2: {
				System.out.println("digite numero da conta");
				numConta = s.nextInt();
				b.criarPoupanca(numConta);
				break;
			}
			case 3: {
				System.out.println("digite numero da conta");
				numConta = s.nextInt();
				System.out.println("digite o valor");
				valor = s.nextFloat();
				b.depositar(numConta, valor);
				break;
			}
			case 4: {
				System.out.println("digite numero da conta");
				numConta = s.nextInt();
				System.out.println("digite o valor");
				valor = s.nextFloat();
				b.sacar(numConta, valor);
				break;
			}
			case 5: {
				System.out.println("digite numero da conta");
				numConta = s.nextInt();
				b.renderJuros(numConta);
				break;
			}
			default:
				System.out.println("Opcao invalida");
				break;
			}
		}while (escolha != 5);
	}
}
