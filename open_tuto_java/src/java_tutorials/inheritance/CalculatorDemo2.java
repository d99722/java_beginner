package java_tutorials.inheritance;
class MultiplicaitionableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left*this.right);
	}
}
public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicaitionableCalculator c1 = new MultiplicaitionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();

	}

}
