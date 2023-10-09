package pkg;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want input");
        num = sc.nextInt();
        Inf allInf[] = new Inf[num];
       for(int i = 0; i < allInf.length; i++)
      {
           allInf[i]=new Inf();
           allInf[i].acceptC();
      }
       for(int i = 0; i < allInf.length; i++)
       {
           allInf[i].printC();
       }
    }
}