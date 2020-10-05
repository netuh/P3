package br.unicap.p3.uberRecife.ui;

import java.util.Scanner;

import br.unicap.p3.uberRecife.exceptions.MotoristaNaoDisponivel;
import br.unicap.p3.uberRecife.exceptions.PassageiroExistente;
import br.unicap.p3.uberRecife.exceptions.PassageiroNaoEncontrado;
import br.unicap.p3.uberRecife.logica.UBER;

public class Principal {

	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		UBER uber = new UBER();  
		System.out.println("1 - Para Cadastrar Passagueiro");
		System.out.println("2 - Para Cadastrar Motorista");
		System.out.println("3 - Para Criar Corrida");
		
		System.out.println("Digite a opção desejada:");
		opcao = s.nextInt();
		switch (opcao) {
		case 1: {
			criarPassageiro(uber);
			break;
		}
		case 2: {
			criarMotorista(uber);
			break;
		}
		case 3: {
			criarCorrida(uber);
			break;
		}
		default:
			System.out.println("opccao ainda não implementada");
		}
	}

	private static void criarCorrida(UBER uber) {
		System.out.println("Digite o telefone do passageiro:");
		int telefone = s.nextInt();
		System.out.println("Digite a origem:");
		String origem = s.next();
		System.out.println("Digite o destino:");
		String destino = s.next();
		try {
			uber.criaCorrida(telefone, origem, destino);
		} catch (PassageiroNaoEncontrado e) {
			System.out.println("telefone do passageiro não encontrado");
		} catch (MotoristaNaoDisponivel e) {
			System.out.println("Nenhum motorista disponível, tente novamente mais tarde");
		}
	}

	private static void criarMotorista(UBER uber) {
		System.out.println("Digite nome do motorista:");
		String nome = s.next();
		System.out.println("Digite o telefone:");
		int telefone = s.nextInt();
		System.out.println("Digite a placa:");
		String placa = s.next();
		System.out.println("Digite o modelo do carro:");
		String modelo= s.next();
		try {
			uber.criaMotorista(nome, telefone, placa, modelo);
		} catch (PassageiroExistente e) {
			System.out.println("Telefone já cadastrado");
		}
	}

	private static void criarPassageiro(UBER uber) {
		System.out.println("Digite nome do passagueiro:");
		String nome = s.next();
		System.out.println("Digite o telefone:");
		int telefone = s.nextInt();
		try {
			uber.criaPassageiro(nome, telefone);
		} catch (PassageiroExistente e) {
			System.out.println("Telefone já cadastrado");
		}
	}
}
