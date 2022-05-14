package Assignment;

public class pyramidNumber {
         public static void main(String args[])
         {
        	 int rows=5;     
    	     for (int i=1; i<=rows; ++i)    //rows
    	     {
    	    	for(int j=1;j<=i;++j)      //column
    	    	{
    	    		System.out.print(j+" ");
    	    	}
    	    	System.out.println();
    	     }
    	     System.out.println("Revers");
    	     for (int i=rows; i>=0;i--)    //rows
    	     {
    	    	for(int j=1;j<=i;++j)      //column
    	    	{
    	    		System.out.print(j+" ");
    	    	}
    	    	System.out.println(); 
    	     }
         }
}
