package Assignment;

public class halfpyramid {
	public static void main(String args[]) {
		int n = 5;
		for (int i = 1; i <= n; i++) // rows
		{
			for (int j = 1; j <= i; j++) // column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("  reverse pyramid  ");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}}

//	int rows = 5;for(
//	int i = 1;i<=rows;i++) // rows
//	{
//		for (int j = 1; j <= i; j++) // column
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}System.out.println("  reverse pyramid  ");
//
//	for(
//	int i = rows;i>=0;i--)
//{
//	for(int j=1;j<=i;j++)
//	{
//		System.out.print("*");
//	}
//	System.out.println();
//}