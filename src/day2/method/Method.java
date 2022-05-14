package day2.method;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("account  " + getEmpaccount());
		System.out.println("Id  " + getEmpid(17));
	}

	static int getEmpaccount() {

		return 25;
	}

	/*
	 * accessmodifier: non accessmodifier return type mathodname argument
	 */
	static protected double getEmpid(long id) {
		return id;
	}

}
