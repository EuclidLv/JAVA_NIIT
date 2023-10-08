package pkg;

public class Main {
    public static void main(String[] args)
    {
        int choose;
        do {
            Inf inf =new Inf();
            choose = inf.menu();
            switch (choose)
            {
                case 1:  inf.enterData();break;
                case 2:  inf.updateData();break;
                case 3:  inf.displayData();break;
                case 4:   ;break;
                default:  ;break;

            }
        }while(choose != 4);
    }
}