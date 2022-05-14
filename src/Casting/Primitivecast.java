package Casting;

public class Primitivecast {
       public static void main(String[] args) {
    	   int num=7;
    	   double num1=num;//widing implicit double
    	   double d=(double)num1; //explicit
    	   System.out.println(num);
    	   System.out.println(num1);
    	   System.out.println(d);
    	   double salary=57000.3457859;
    	   int sal=(int)salary;
    	   long l=(long)salary;
    	   System.out.println("double"+salary);
    	   System.out.println("long salary"+l);
    	   System.out.println("int salary"+sal);
    	   
       }
}
