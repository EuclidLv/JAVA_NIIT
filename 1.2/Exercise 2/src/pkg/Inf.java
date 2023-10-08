package pkg;
import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Inf {
    private String data;
    private String cleanner;
    Scanner sc = new Scanner(System.in);
    public int menu(){
        System.out.println("1. Enter Data");
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit\n");
        System.out.print("Choose the option: ");
        return(sc.nextInt());
    }
    public void enterData()
    {
        cleanner = sc.nextLine();
        System.out.println("please enter the data: ");
        data = sc.nextLine();
    }
    public void updateData()
    {
        cleanner = sc.nextLine();
        System.out.println("please update the data: ");
        data = sc.nextLine();
    }
    public void displayData()
    {
        cleanner = sc.nextLine();
        System.out.println("the data is: " + data);
    }

    public void chooseC(int n)
    {
        switch (n)
        {
            case 1:  enterData();break;
            case 2:  updateData();break;
            case 3:  displayData();break;
            case 4:   ;break;
            default:  ;break;

        }
    }
}
