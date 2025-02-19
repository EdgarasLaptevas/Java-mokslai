public class RegularTicket extends Ticket {

    private String movieTitle;
    private String seatNumber;

    public RegularTicket(int ticketId, int customerId, String movieTitle, String seatNumber) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    double getPrice() {
        return 12.0;
    }

    @Override
    public String toString() {
        return "RegularTicket: " + this.movieTitle + ", Seat: " + this.seatNumber + ", Price: $" + getPrice();
    }
}
