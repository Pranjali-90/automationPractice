package day1.variable;

public class Variable4 {

	
		// TODO Auto-generated method stub
//globle variable
		static int empID=28;
		
		public static void main(String[] args) {
		int age=31,empId=123;
		System.out.println("age"+age);
		System.out.println("local var empid="+empId);
		System.out.println("direct way to accessSGV, empID="+empID);
	
		System.out.println("Std way to accessSgv,empid="+Variable4.empID);
	}

}
