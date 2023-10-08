class Reservation{
    private long TicketID;
    Reservation()
    {
        TicketID = 000000000000000000000000;
    }
    public void ShowTicket()
    {
        System.out.println("the Ticket ID is: " + TicketID);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Reservation rv = new Reservation();
        rv.ShowTicket();
    }
}