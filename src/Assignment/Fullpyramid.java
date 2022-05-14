package Assignment;

public class Fullpyramid {
	public static void main(String args[]) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("   revers   ");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}