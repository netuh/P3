
public class MostraLetra implements Runnable{

	char letra;
	
	public MostraLetra(char c) {
		letra = c;
	}

	@Override
	public void run() {
		for (int i = 10; i > -1; i++) {
			System.out.println(letra);
		}			
	}

}
