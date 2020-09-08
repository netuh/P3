public class BhaskaraResl {

	private Delta delta;
	private double numberB;
	private double numberA;

	public BhaskaraResl(double numberA, double numberB, double numberC) {
		this.numberA = numberA;
		this.numberB = numberB;
		delta = new Delta(numberA, numberB, numberC);
	}

	public double raiz1() {
		double x1 = (-numberB + Math.sqrt(delta.calculaDelta())) / (2*numberA);
		return x1;
	}
	
	public double raiz2() {
		double x2 = (-numberB - Math.sqrt(delta.calculaDelta())) / (2*numberA);
		return x2;
	}
	
}
