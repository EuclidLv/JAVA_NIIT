import java.util.Scanner;

class leap
{
	public static void main(String[] args)
		{
			int year;
			Scanner sc = new Scanner(System.in);
			System.out.println("Plz enter a year:");
			year = sc.nextInt();
			if(year % 4 == 0 && year % 100 != 0)
				{
					System.out.println("This year is leap");
				}
			else if(year % 400 == 0)
				{
					System.out.println("This year is leap");
				}
			else 
				{
					System.out.println("This year is not leap");
				}
		}
}