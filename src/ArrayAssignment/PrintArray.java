package ArrayAssignment;

public class PrintArray {
   public static void main(String[] args) {
	   int[] arr=new int[] {1,2,3,4,5};
	   System.out.println("Element of given array");
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]+" "); 
	   }
	   System.out.println();
	   
	   System.out.println("Print reverse array");
	   for(int i=arr.length-1;i>=0;i--) {
		   System.out.println(arr[i]+" "); 
	   }
   }
}
