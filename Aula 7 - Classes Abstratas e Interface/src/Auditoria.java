import bancos.Banco;
import bancos.BancoGenerico;
import bancos.Corretora;

public class Auditoria {

	final static double MINIMO = 500.00;
	/* ... */

	public boolean investigaBanco(BancoGenerico b) {
		double sm;
		sm = b.saldoTotal() / b.numContas();
		return (sm > MINIMO);
	}

	public static void main(String[] args) {
		Auditoria a = new Auditoria();
		
		Banco b = new Banco();
		Corretora c = new Corretora();
		
		a.investigaBanco(b);
		a.investigaBanco(c);
	}
}
