package day2.method;

public class Method2 {

	public static void main(String[] args) {

		System.out.println("Add=" + getAdditionResult(123.5, 567));
		System.out.println("*************");
		System.out.println("Addition=" + getAdditionResult(678, 89.75));
	}

	static double getAdditionResult(double num1, double num2) {

		System.out.println("Num1=" + num1);
		System.out.println("Num2=" + num2);
		double result = num1 + num2;
		return result;
	}
}