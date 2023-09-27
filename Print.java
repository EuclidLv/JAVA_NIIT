import java.util.Scanner;

class book
{
	String BName;
	float BPrice;
	
	void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("input your book's name");
		BName = sc.nextLine();
		System.out.println("input your book's price");
		BPrice = sc.nextFloat();
	}
	void print()
	{
		System.out.println(BName);
		System.out.println(BPrice);
	}
}

class Print
{
	public static void main(String[] args)
		{
			book b1 = new book();
			b1.accept();
			b1.print();				
		}
}

