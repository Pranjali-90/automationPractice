package day2.method;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading m1 = new Methodoverloading();
		System.out.println("Sum1:" + addnumbers());
		System.out.println("Sum2:" + m1.addnumbers(23, 45));
		System.out.println("Sum3:" + m1.addnumbers(34, 15.7));
		System.out.println("Sum4:" + m1.addnumbers(12, 45, 67));
		System.out.println("Sum5:" + m1.addnumbers(32, 34, 43.5));
		System.out.println("Sum6:" + m1.addnumbers(32, 34.7, 43));
	}

	static int addnumbers() {
		int num1 = 12, num2 = 45;
		return num1 + num2;
	}

	double addnumbers(int num1, int num2) {
		return num1 + num2;
	}

	double addnumbers(int num1, double num2) {
		return num1 + num2;
	}

	int addnumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	double addnumbers(int num1, int num2, double num3) {
		return num1 + num2 + num3;
	}

	double addnumbers(int num1, double num2, int num3) {
		return num1 + num2 + num3;
	}
}
