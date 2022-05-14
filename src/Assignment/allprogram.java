package Assignment;

public class allprogram {
	static int rollno = 7;
	double salary = 57000;
	char grade = 'A';

	public static void main(String[] args) {
		System.out.println("Rollno:=" + rollno);

		allprogram ref = new allprogram();
		System.out.println("Salary" + ref.salary);
		System.out.println("1st method");
		getResult(45);
		System.out.println("2nd method");
		ref.getResult(6, 55000);
		System.out.println("3rd method");
		ref.getResult(79, 90000, 'A');
	}

	static void getResult(int i) {
		System.out.println("Rollno:=" + i);

	}
    void getResult(int rollno, double salary) {
		System.out.println("Rollno:=" + allprogram.rollno);
		System.out.println("Rollno:=" + rollno);
		System.out.println("Salary" + this.salary);
		System.out.println("Salary" + salary);
	}

	void getResult(int i, double j, char A) {
		System.out.println("Rollno:=" + i);
		System.out.println("Salary=" + j);
		System.out.println("char= " + A);
	}

}
