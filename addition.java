import java.util.Scanner;

class addition
{
	public static void main(String[] argus)
		{
			int a;
			int b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the fisrt number");
			a = sc.nextInt();
			System.out.println("enter the another number");
			b = sc.nextInt();
			a += b;
			System.out.print("The result is " + a);
		}
}