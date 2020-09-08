package logica;

import entidades.Aluno;

public class Execucao {
	
	public static void main(String[] args) {
//		DiasDaSemana d1 = DiasDaSemana.DOMINGO;
//		DiasDaSemana d2 = DiasDaSemana.SABADO;
//		DiasDaSemana d3 = DiasDaSemana.QUARTA;
//		
//		float salarioBase = 1000;
//		
//		System.out.println("Valor a receber pelo dia: "+
//						  (salarioBase*d1.getMultiplicadorHora()));
//		System.out.println("Valor a receber pelo dia: "+
//						  (salarioBase*d2.getMultiplicadorHora()));
//		System.out.println("Valor a receber pelo dia: "+
//						  (salarioBase*d3.getMultiplicadorHora()));
		
		Aluno a1 = new Aluno("Maria");
		Aluno a2 = new Aluno("João");
		
		System.out.println(a1.getNome());
		
		a1.imprime();
		a2.imprime();
	}
}
