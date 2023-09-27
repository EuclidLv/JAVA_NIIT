import java.util.Scanner;

class Judge
{
	char judement(int mark)
		{
			if(mark > 90)
				return('A');
			else if(mark <= 90 && mark > 75)
				return('B');
			else if(mark <= 75 && mark >60)
				return('C');
			else
				return('N');
		}
}



class mark
{
	public static void main(String[] args)
		{	
			int mark;
			Scanner sc = new Scanner(System.in); 
			System.out.println("input a mark: ");
			mark = sc.nextInt();
			char grand = Judge.judement(mark);
			System.out.println("The result is" + grand);
		}
}