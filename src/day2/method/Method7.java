package day2.method;

public class Method7 {
	static int empid = 123; // global variable static
	double sal = 79000.00;

	public static double getEmpId() // static method
	{
		System.out.println("Hi,getEmpId");
		return empid;
	}

	public double getEmpSalary() // non-static method
	{   
		System.out.println("Hi,getEmpsalary");
		return sal;
	}

	public static void main(String[] args) {
		int age = 31; // local variable declared inside method body
		System.out.println("empid" + empid);
		System.out.println("age" + age);
		//Method7.getEmpId();
		System.out.println("empid"+Method7.getEmpId());
		Method7 v1; // classname ref ;
		v1 = new Method7(); // ref=new classname();
		// LGvariable v1=new LGvariable;
		System.out.println("salary=" + v1.sal);
		System.out.println("empsalary=" + v1.getEmpSalary());
	}

}
