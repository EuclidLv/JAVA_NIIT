package pkg;
import java.util.Scanner;
public class Inf {
    private String employeeName;
    private String clean;
    private long mobileNumber;
    private String address;
    private String maritalStatus;
    private String DoB;

    public Inf() {

    }
//    public Inf(String employeeName, long mobileNumber, String address, String maritalStatus, String doB) {
//        this.employeeName = employeeName;
//        this.mobileNumber = mobileNumber;
//        this.address = address;
//        this.maritalStatus = maritalStatus;
//        DoB = doB;
//    }

    public void acceptC(){
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the employee's name: ");
        employeeName = sc.nextLine();
        System.out.println("please input the employee's mobile number: ");
        mobileNumber = sc.nextLong();
        clean = sc.nextLine();
        System.out.println("please input the employee's address: ");
        address = sc.nextLine();
        System.out.println("please input the employee's marital status: ");
        maritalStatus = sc.nextLine();
        System.out.println("please enter the employee's date of birth: ");
        DoB = sc.nextLine();
    }

    public void printC(){
        System.out.println("the employee's name is: " + employeeName);
        System.out.println("the employee's mobile number is: " + mobileNumber);
        System.out.println("the employee's address is: " + address);
        System.out.println("the employee's marital status is: " + maritalStatus);
        System.out.println("the employee's date of birth is: " + DoB);
    }
}
