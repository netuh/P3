
public class NumeroImaginario {

	private float a;
	private float b;
	
	public NumeroImaginario(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public void imprima() {
		System.out.println(a+" + "+b+"i");
	}
	
	public boolean ehIgual(NumeroImaginario n) {
		//if (this.a == n.getA() && this.b == n.getB())
		if (this.a == n.a && this.b == n.b)
			return true;
		else
			return false;
	}
	
	public NumeroImaginario soma(NumeroImaginario n) {
//		NumeroImaginario novo = new NumeroImaginario((this.a+n.a),
//													(this.b+n.b));
		float novoA = this.a + n.a;
		float novoB = this.b + n.b;
		NumeroImaginario novo = new NumeroImaginario(novoA,novoB);
		return novo;
	}
	
	public NumeroImaginario subtraia(NumeroImaginario n) {
//		NumeroImaginario novo = new NumeroImaginario((this.a+n.a),
//													(this.b+n.b));
		float novoA = this.a - n.a;
		float novoB = this.b - n.b;
		NumeroImaginario novo = new NumeroImaginario(novoA,novoB);
		return novo;
	}

	public float getA() {
		return a;
	}
	
	public float getB() {
		return b;
	}
}
