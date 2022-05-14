package Casting;
class Parent{
	void show()  //function/method
	{
		System.out.println("parent method");
	}
	void callme()  //function/method
	{
		System.out.println("parent callme method");
	}
}
class Child extends Parent{
	void readme() {
		System.out.println("child method");
	}
}
public class Nonprimitivecast {
   public static void main(String args[]) {
	   Parent p=new Parent();  //ref and object of parent class
	   p.show();
	   p.callme();
	   Child c=new Child();  //ref and object of child class
	   c.readme();
	   c.show();
	   c.callme();
	   //auto/implicit up casting
	   Parent p1=new Child(); //child class obj n parent class reference
	   p1.show();
	   p1.callme();
	  // p1.readme();
	   //explicit up casting
	  // Parent p2=c;
	   //or 
	   Parent p2=(Parent)c;
	   //or    Parent p2=(Parent)new Child();
	   p2.show();
	   p2.callme();
	  // p2.readme();
	   // Parent p1=new Child(); auto/implicit up casting
	  // Child c1=new Parent() //directly downcasting not possible 
	   
	  Child c1=(Child)p1; //explicitly downcasting
	  c1.readme();
	   c1.show();
	   c1.callme();
	  
   }
}
