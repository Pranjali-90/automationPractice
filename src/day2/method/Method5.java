package day2.method;

public class Method5 {
	public static double getIntrest(int p, double r, int t) {
		System.out.println("Principle:" + p);
		System.out.println("Rate:" + r);
		System.out.println("Time:" + t);
		return (p * r * t) / 100;
	}

	private double getIntrest1(int p, double r, int t) {
		double result = (p * r * t) / 100;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("*********static method**********");
		// std way to call static method
		System.out.println("Get intrest:" + Method5.getIntrest(250000, 6.5, 60));

		// update
		System.out.println("*********update static method**********");
		System.out.println("Get intrest:" + Method5.getIntrest(70000, 4.7, 45));

		// way to call non static method
		// class name var name=new class name();
		Method5 a1 = new Method5();
		System.out.println("*********non static method**********");
		System.out.println("Get intrest1:" + a1.getIntrest1(250000, 6.5, 60));
	}

}