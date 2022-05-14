package day2.method;

public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add=" + getAdditionResult(123.5, 567));
		System.out.println("*************");
		System.out.println("Addition=" + Method3.getAdditionResult(678, 89.75)); // std way to call method
		System.out.println("*************");
		double sum = getAdditionResult(25, 30); // assign
		System.out.println("sum of num=" + sum);
		double result = sum * 100;
		System.out.println("After opret=" + result);

	}

	static double getAdditionResult(double num1, double num2) {

		System.out.println("Num1=" + num1);
		System.out.println("Num2=" + num2);
		double result = num1 + num2;
		return result;
	}

}
