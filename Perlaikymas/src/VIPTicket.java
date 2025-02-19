public class VIPTicket extends Ticket {

    private String movieTitle;
    private String seatNumber;
    private String extraBenefits;

    public VIPTicket(int ticketId, int customerId, String movieTitle, String seatNumber, String extraBenefits) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.extraBenefits = extraBenefits;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getExtraBenefits() {
        return extraBenefits;
    }

    @Override
    double getPrice() {
        return 20.0;
    }

    @Override
    public String toString() {
        return "VIPTicket: " + this.movieTitle + ", Seat: " +
                this.seatNumber + ", Price: $" + getPrice() +
                ", Benefits: " + this.extraBenefits;
    }
}
