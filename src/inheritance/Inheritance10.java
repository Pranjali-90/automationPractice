package inheritance;
//
////parent class
//class Company {
//	// global variable
//	// method with method overloading use of this keyword
//	// constructor with overloading and use of this()
//}
//
////child class of Company
//class Employee extends Company {
//	// global variable name as Company name variable
//	// method with method overloading use of this & super keyword
//	// constructor with overloading and use of this() & super()
//}
//
   class Company{
	   int empid=7;
	   double salary=70000.50;
	   Company(){
		   System.out.println("1 st constructor of company");
	   }
  Company(char c){
		  this();
		  System.out.println("2 nd constructor of company");
	   } 
  void C() {
	  System.out.println("Method of company");
	 
  }
  void C(int empid,double salary) {
	  System.out.println("Employee id:"+empid);
	  System.out.println("Employee Salary:"+salary);
	  System.out.println("Employee id:"+this.empid);
	  System.out.println("Employee Salary:"+this.salary);
  }
   }
   class Employee extends Company{
	   int empid=31;
	   double salary=67000.50;
	   Employee(){
		   System.out.println("constructor of employee");
	   }
  Employee(double y){
	  super('A');
	  System.out.println("constructor of employee"+y);
	   }
  void E() {
	  System.out.println("Method of Employee");
	this.C();
  }
  void E(int empid,double salary) {
	  super.C(45,78000.35);
	  System.out.println("Employee id:"+empid);
	  System.out.println("Employee Salary:"+salary);
	  System.out.println("Employee id:"+this.empid);
	  System.out.println("Employee Salary:"+this.salary);
  }
   }
   
public class Inheritance10 {

	public static void main(String[] args) {
		 Employee E1=new Employee(2022);
		 E1.E();
		 E1.E(8,50000.70);
	}

}