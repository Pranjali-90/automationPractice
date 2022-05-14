package day2.method;

public class Method4 {
	public static double getIntrest(int p, double r, int t) {
		System.out.println("paise:" + p);
		System.out.println("rate:" + r);
		System.out.println("time:" + t);
		return (p * r * t) / 100;
	}

	public static void main(String[] args) {
		System.out.println("Get intrest:" + getIntrest(250000, 6.5, 60));

	}

}
