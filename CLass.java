import java.util.Scanner;

class student
{
	String name;
	int age;
	float marks;
	void PrintInline(){System.out.println(name + " " + " " + age + " " + marks);};
}

class CLass
{
	public static void main(String[] args)
		{
			student s = new student();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			s.name = sc.nextLine();
			System.out.println("Enter your age");
			s.age = sc.nextInt();
			System.out.println("Enter your marks");
			s.marks = sc.nextFloat();
			System.out.println("your name is " + s.name);
			System.out.println("your age is " + s.age);
			System.out.println("you marks is " + s.marks); 
			System.out.println("Print Inline");
			s.PrintInline();
		}
}