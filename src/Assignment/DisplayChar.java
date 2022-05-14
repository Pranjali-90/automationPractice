package Assignment;

public class DisplayChar {

	public static void main(String[] args) {
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.println(c1 + " ");
		}
		System.out.println("print in reverse order ");
		for (char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1 + " ");
		}

		System.out.println("/n print small letters ");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
	}

}
