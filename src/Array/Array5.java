package Array;

class maxmin{
	//creating a method which receives an array as a parameter
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				//
				min=arr[i];
			}
		}
		System.out.println("Min num in array is:"+min);
	}
	static void max(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				//
				max=arr[i];
			}
		}
		System.out.println("Max num in array is:"+max);
	}
}
public class Array5 {
    public static void main(String args[]) {
    	//declaring n initializing an array
    	int a[]= {33,13,4,50,15,1};
    	maxmin.min(a);
    	maxmin.max(a);
    }
}
