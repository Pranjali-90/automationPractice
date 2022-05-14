package constructor;

public class const2 {
	int empid;
	double salary;

	const2() { // default constructor
	}

	const2(int i, double s) {
		empid = i; // assign local var value to global var
		salary = s;
	}

	void display() {
		System.out.println(empid + "    " + salary);

	}

	public static void main(String args[]) {
		const2 c1 = new const2(101, 50000.90);
		c1.display();

		const2 c2 = new const2(103, 55000);
		c2.display();
		const2 c3 = new const2();
		c3.display();
	}
}
