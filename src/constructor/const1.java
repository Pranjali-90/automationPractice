package constructor;

public class const1 {
	int age;
	double salary;

	public static void main(String[] args) {
		int id = 17;
		const1 c1 = new const1(); // default constructor const1()
		System.out.println("Age= " + c1.age);
		System.out.println("Salary= " + c1.salary);
		System.out.println(id);
	}

}
