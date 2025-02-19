import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieScreening {

    private String movieTitle;
    private String screeningTime;
    private List<Customer> attendees;

    public MovieScreening(String movieTitle, String screeningTime) {

        if (movieTitle == null || movieTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie title cannot be null or empty.");
        }

        if (screeningTime == null || screeningTime.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be null or empty.");
        }

        this.movieTitle = movieTitle;
        this.screeningTime = screeningTime;
        this.attendees = new ArrayList<>();
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getScreeningTime() {
        return screeningTime;
    }

    public List<Customer> getAttendees() {
        return attendees;
    }

    public void addAttendee(Customer customer) {

        if (customer == null) {
            throw new NullPointerException("Customer cannot be null");
        }

        if (this.attendees.contains(customer)) {

            System.out.println(customer.getName() + "already attending this movie screening");
        } else {
            this.attendees.add(customer);
        }
    }

    @Override
    public String toString() {

        String attendingCustomers = this.attendees.stream()
                .map((customer) -> customer.getName())
                .collect(Collectors.joining(", "));


        if (this.attendees.isEmpty()) {
            return this.movieTitle + " (" + this.screeningTime + ")";
        }

        return this.movieTitle + " (" + this.screeningTime + "): " + attendingCustomers;
    }
}
