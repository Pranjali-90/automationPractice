package day2.method;

public class Method1 {
	public static void printDetails(int age, int salary) {

		System.out.println("hi,everone");
		System.out.println("I am " + age + " yrs old");
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		System.out.println("*************");
		printDetails(31, 55000); // drec call method
		System.out.println("*************");
		Method1.printDetails(25, 65000); // std way tocall method
		System.out.println("*************");
		printDetails(35, 87000);

	}
}
