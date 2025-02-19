abstract class Ticket {

    final private int ticketId;
    final private int customerId;

    public Ticket(int ticketId, int customerId) {

        if (ticketId <= 0) {
            throw new IllegalArgumentException("Customer Id must be a positive number.");
        }

        if (customerId <= 0) {
            throw new IllegalArgumentException("Customer Id must be a positive number.");
        }

        this.ticketId = ticketId;
        this.customerId = customerId;
    }

    abstract double getPrice();
}
