package pkg;
import java.util.Scanner;
public class Ary {
    private final int[] x = new int[10];

    Ary() {
        for (int i = 0; i < 10; i++)
            x[i] = 0;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("please enter the " + (i + 1) + " figure");
            x[i] = sc.nextInt();
        }
    }

    public int Sum() {
        int sumC = 0;
        for (int i = 0; i < 10; i++) {
            sumC += x[i];
        }
        return sumC;
    }


    public void printA() {
        System.out.print("The array is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }
    }
}