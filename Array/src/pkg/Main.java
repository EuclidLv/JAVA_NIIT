package pkg;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ary ary1 = new Ary();
        ary1.accept();
        ary1.printA();
        System.out.println("\nthe sum of the array is: " + ary1.Sum());
    }
}