
public class Lista {

	static class Campo {

		private int valor;
		private Campo proximo;
		public int getValor() {
			return valor;
		}
		public Campo getProximo() {
			return proximo;
		}
	}
	
	private Campo primeiro;
	
	public boolean procura(int valor) {
		return procuraValor(valor, primeiro);
	}

	private boolean procuraValor(int valor, Campo campo) {
		if (campo == null) {
			return false;
		}
		if (campo.getValor() == valor) {
			return true;
		}
		return procuraValor(valor, campo.getProximo());
	}
		
}
