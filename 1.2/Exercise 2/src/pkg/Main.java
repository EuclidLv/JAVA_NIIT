package pkg;

public class Main {
    public static void main(String[] args)
    {
        int choose;
        Inf inf =new Inf();
        do {
            choose = inf.menu();
            inf.chooseC(choose);
        }while(choose != 4);
    }
}