package ThisKeyword;

public class ThisKeyword
{
	int x;
	// Constructor with a parameter
	public ThisKeyword(int x) {
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
		this.x = x;
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
	}
	// Call the constructor
	public static void main(String[] args) {
		ThisKeyword myObj = new ThisKeyword(45);
		System.out.println("Value of x = " + myObj.x);//
	}

}