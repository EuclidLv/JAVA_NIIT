import java.util.Scanner;

class Judge
{
	private int mark;
	private char grand;
	void AcceptC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a mark: ");
		mark = sc.nextInt();
	}
	 char judement(int mark) {
			if(mark > 90)
				return('A');
			else if( mark > 75 && mark <= 90)
				return('B');
			else if(mark >60 && mark <= 75)
				return('C');
			else
				return('N');
	}

	void Display()
	{
		grand = judement(mark);
		System.out.println("The result is" + grand);
	}
}



class mark
{
	public static void main(String[] args)
		{
			Judge ju = new Judge();
			ju.AcceptC();
			ju.Display();
		}
}
