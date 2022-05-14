package day1.variable;

public class LGvariable {
	static int empid = 123; // global variable static
	double sal = 79000.00; // nsgv

	public static void main(String[] args) {
		int age = 31; // local variable declared inside mathod body
		System.out.println("empid :" + empid);
		System.out.println("age :" + age);
		// LGvariable v1; // classname ref
		// v1 = new LGvariable(); // ref var=new clasname()
		LGvariable v1 = new LGvariable();
		System.out.println("salary=" + v1.sal);
	}

}
