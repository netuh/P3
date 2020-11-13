
public class Instrumento {

	static class GuitarraAcustisca extends Instrumento{
		
	}
	
	private String nome = "Guitarra";
	private Nota afinacao;
	
	
	public static void main(String[] args) {
		Instrumento g = new Instrumento();
		g.afinacao = Nota.Do;
		
		Instrumento c = new Instrumento.GuitarraAcustisca();
	}
	
	static enum Nota{
		Do,Re,Mi,Fa;
	}

}


