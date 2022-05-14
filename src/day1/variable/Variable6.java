package day1.variable;

public class Variable6 {
	
 int empid=28;//non static Var
		
		public static void main(String[] args) {
	
		System.out.println("start");
		//access NSGV create object
		//classname referancevariable;
		//referancevariable=new classname(); object created
		Variable6 e1;
		e1=new Variable6();
		System.out.println("NSGV,empid="+e1.empid);
		//for update NSGV
		e1.empid=789;
		System.out.println("updated NSGV,empid="+e1.empid);
		
		System.out.println("end");


}

}
