package condition;

public class ifCondition {
      
	public static void main(String[] args) {
		
		int num=55;
		//check  if the num is divisibal by 2or not
		   if(num%2==0) {
			  System.out.println("even num");
		   }
		   else { 
			   System.out.println("odd num");
		   }
		   System.out.println("********** method*****");
	    
		   ifCondition.checkEvenOddNumber(43);
		   checkEvenOddNumber(44);
		   checkEvenOddNumber();
		   ifCondition i1=new ifCondition();
	
		  System.out.println("number is even  "+i1.isNumberEven());
					}
	//static method with parameter& return type void		
	static void checkEvenOddNumber(int num)
	{  if(num%2==0) {
		  System.out.println("even num");
	   }
	   else { 
		   System.out.println("odd num");
	   }
		
	}
	//static method with parameter& return type boolean
	static  boolean isNumberEven(int num) {
		 if(num%2==0) {
			  return true;
		   }
		   else { 
			   return true;
		   }
	}
	//s method with no parameter n return type void
	static void checkEvenOddNumber()
	{  int num=30; 
		if(num%2==0) {
		  System.out.println("even num");
	   }
	   else { 
		   System.out.println("odd num");
	   }
		
	}
	 boolean isNumberEven() {
		int num=50;
		 if(num%2==0) {
			  return true;
		   }
		   else { 
			   return true;
		   }
	
	}

}
