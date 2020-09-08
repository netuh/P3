
public class Execucao {

	public static void main(String[] args) {
		NumeroImaginario n1 = new NumeroImaginario(1,2); // 1+2i
		NumeroImaginario n2 = new NumeroImaginario(3,4); // 3+4i
		NumeroImaginario n3 = new NumeroImaginario(1,2); // 1+2i
		
		n1.imprima();
		n2.imprima();
		System.out.println(n1.ehIgual(n2));
		System.out.println(n1.ehIgual(n1));
		System.out.println(n1.ehIgual(n3));
		
		NumeroImaginario n4 = n1.soma(n2);
		n4.imprima();
		
		OperacoesImaginarias o = new OperacoesImaginarias();
		NumeroImaginario n5 = o.soma(n1,n2);
		n5.imprima();
		
		NumeroImaginario n6 = n1.subtraia(n1);
		n6.imprima();
	}
}
