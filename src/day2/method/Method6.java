package day2.method;

public class Method6 {

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

	static double getIntrest2() {
		double p = 50000, r = 5.7, t = 70;
		double res = (p * r * t) / 100;
		return res;
	}

	public static void main(String[] args) {
		System.out.println("*********static method**********");
		// std way to call static method
		System.out.println("Get intrest:" + Method6.getIntrest(250000, 6.5, 60));
		System.out.println("Get intrest:" + Method6.getIntrest2());
		// way to call non static method
		// class name var name=new class name();
		Method6 a1 = new Method6();
		System.out.println("*********non static method**********");
		System.out.println("Get intrest:" + a1.getIntrest1(250000, 6.5, 60));
	}

}
