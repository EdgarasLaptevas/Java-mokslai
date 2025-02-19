import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {

    private final Map<Integer, List<String>> customers;
    private final List<Ticket> tickets;
    private List<MovieScreening> movieScreenings;

    public Theater() {
        this.customers = new HashMap<>();
        this.tickets = new ArrayList<>();
        this.movieScreenings = new ArrayList<>();
    }

    public Map<Integer, List<String>> getCustomers() {
        return customers;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<MovieScreening> getMovieScreenings() {
        return movieScreenings;
    }

    public void addCustomer(int id, String name, int age) {

        if (id <= 0) {
            throw new IllegalArgumentException("Customer Id must be a positive number.");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(" Customer name cannot be null or empty.");
        }
        if (age <= 5) {
            throw new IllegalArgumentException("Customer must be at least 5 years old.");
        }

        List<String> customerInfo = new ArrayList<>();
        customerInfo.add(name);
        customerInfo.add(String.valueOf(age));

        this.customers.put(id, customerInfo);
    }

    public void printCustomers() {

        this.customers.forEach((key, value) -> System.out.println(key + ": " + value.getFirst() + ", Age: " + Integer.parseInt(value.get(1))));
    }

    public void sellTicket(Ticket ticket) {

        if (ticket == null) {
            throw new NullPointerException("Ticket cannot be null");
        }

        this.tickets.add(ticket);
    }

    public void printTickets() {

        this.tickets.forEach(System.out::println);
    }

    public void addMovieScreening(String movieTitle, String screeningTime) {

        if (movieTitle == null || movieTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie title cannot be null or empty.");
        }

        if (screeningTime == null || screeningTime.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be null or empty.");
        }

        this.movieScreenings.add(new MovieScreening(movieTitle, screeningTime));
    }

    public void printScreenings() {

        this.movieScreenings.forEach(System.out::println);
    }

    public void enrollCustomerInScreenings(int customerId, String movieTitle) {

        MovieScreening movieScreeningFound = this.movieScreenings.stream()
                .filter((movieScreening) -> movieScreening.getMovieTitle().equalsIgnoreCase(movieTitle))
                .findFirst()
                .orElse(null);

        if (movieScreeningFound != null) {

            if (this.customers.containsKey(customerId)) {

                String customerName = this.customers.get(customerId).getFirst();
                int customerAge = Integer.parseInt(this.customers.get(customerId).get(1));
                movieScreeningFound.addAttendee((new Customer(customerId, customerName, customerAge)));
                return;
            }
            System.out.println("Customer ID not found");
            return;
        }
        System.out.println("Movie screening not found");

    }
}
