package day1.variable;

public class Variable7 {
	int Empid;
	static double salary = 70000;

	public static void main(String[] args) {
		System.out.println("statc globale var");
		System.out.println("SGV,salary=" + salary);
		System.out.println("Std SGV,salary=" + Variable7.salary);
		Variable7.salary = 1000000; // forupdate SGV
		System.out.println("updated SGV,salary=" + Variable7.salary);
		System.out.println(" non statc globale var");
		Variable7 v1 = new Variable7();
		System.out.println("NSGV,Empid=" + v1.Empid);
		v1.Empid = 123; // for updateNSGV
		System.out.println("updated NSGV,Empid=" + v1.Empid);

	}
}
