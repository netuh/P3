
public class Exemplo1 {

	public static void main(String[] args) {
		Thread a = new Thread(new MostraLetra('a')); 
		Thread b = new Thread(new MostraLetra('b'));
		Thread c = new Thread(new MostraLetra('c'));
		
		a.start();
		b.start();
		c.start();
	}
}
