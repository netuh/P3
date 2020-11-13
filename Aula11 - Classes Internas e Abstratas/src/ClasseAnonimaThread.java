
public class ClasseAnonimaThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Tarefa());
		int i = 19;
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("mensagem "+ i);
			}
		});
		t1.start();
		t2.start();
	}
}
