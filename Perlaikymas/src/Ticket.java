abstract class Ticket {

    final private int ticketId;
    final private int customerId;

    public Ticket(int ticketId, int customerId) {
        this.ticketId = ticketId;
        this.customerId = customerId;
    }

    abstract double getPrice();
}
