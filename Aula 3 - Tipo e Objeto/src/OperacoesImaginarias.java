

public class OperacoesImaginarias {

	public NumeroImaginario soma(NumeroImaginario n1, NumeroImaginario n2) {
//		NumeroImaginario novo = new NumeroImaginario((this.a+n.a),
//													(this.b+n.b));
		float novoA = n1.getA() + n2.getA();
		float novoB = n1.getB() + n2.getB();
		NumeroImaginario novo = new NumeroImaginario(novoA,novoB);
		return novo;
	}
}
