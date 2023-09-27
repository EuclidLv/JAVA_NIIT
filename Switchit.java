import java.util.Scanner;

class Menu
{
	void printMenu()
		{
			System.out.println("Choose the operation");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
		}
}

class caculator
{
	void Ido()
	{
			int choose;
	int num1;
	int num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("please input two numbers");
	System.out.println("the first one");
	num1 = sc.nextInt();
	System.out.println("the second");
	num2 = sc.nextInt();
		Menu me = new Menu();
	me.printMenu();
	choose = sc.nextInt();
	switch(choose)
		{
			case 1:
				System.out.println("The result is " + (num1 + num2));break;
			case 2:
				System.out.println("The result is " + (num1 - num2));break;
			case 3:
				System.out.println("The result is " + (num1 * num2));break;
			case 4:
				System.out.println("The result is " + (num1 / num2));break;
			default:
				System.out.println("Error");
			
		}	
	}
}

class Switchit
{
	public static void main(String[] args)
		{
			caculator ca = new caculator();
			ca.Ido();
		}
}
