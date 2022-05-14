package day1.variable;

public class Variable5 {

	static int empID = 28;

	public static void main(String[] args) {
		int age = 31, empId = 123;
		System.out.println("age" + age);
		System.out.println("local var empid=" + empId);
		System.out.println("direct way to accessSGV, empID=" + empID);
		empId = 456;// update local var

		System.out.println("newlocal var empid=" + empId);
		Variable4.empID = 789;// for update static GV classname.SGV=value
		System.out.println("Std way to accessSgv,empid=" + Variable4.empID);
	}

}
