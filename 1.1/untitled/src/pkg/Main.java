package pkg;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want input");
       int num = sc.nextInt();
        Inf []allInf = new Inf[num];
        for(int i = 0; i < num; i++)
        {
            allInf[i].acceptC();
        }
        for(int i = 0; i < num; i++)
        {
            allInf[i].printC();
        }

    }
}