class SampleClass{
    private int counter = 10;
    public void Display()
    {
        System.out.println("the value of counter is: " + counter );
    }
}




public class Main {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.Display();
    }
}