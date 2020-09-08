
public class Delta {

	private double numberA;
	private double numberB;
	private double numberC;

	public Delta(double numberA, double numberB, double numberC) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.numberC = numberC;
	}

	public double calculaDelta() {
		double delta = -4*(numberA)*(numberC) + Math.pow(numberB, 2);
		//double delta = (numberB*numberB)-4*(numberA)*(numberC);
		return delta;
	}
}
