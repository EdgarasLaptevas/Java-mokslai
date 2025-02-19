public class Main {
    public static void main(String[] args) {

//        Customer customer = new Customer(101, "Evelyn", 27);
//        System.out.println(customer);

//        Ticket ticket = new Ticket(5, 9);

//        Ticket ticket = new RegularTicket(201, 101, "Inception", "B7");
//        System.out.println(ticket);

//        Ticket ticket = new VIPTicket(202, 102, "Avatar", "A1", "Free Popcorn");
//        System.out.println(ticket);

//        MovieScreening screening = new MovieScreening("Titanic", "Saturday 7PM");
//        System.out.println(screening);
//
//        screening.addAttendee(new Customer(301, "Daniel", 34));
//        System.out.println(screening);
//
//        screening.addAttendee(new Customer(302, "Sophia", 29));
//        System.out.println(screening);
//
//        MovieScreening anotherScreening = new MovieScreening("Interstellar", "Sunday 5PM");
//        anotherScreening.addAttendee(new Customer(303, "Lucas", 42));
//
//        System.out.println(anotherScreening);

        Theater theater = new Theater();
        theater.addCustomer(1, "Alice", 30);
        theater.addCustomer(2, "Bob", 25);
        theater.addCustomer(3, "Jeff", 58);

        theater.printCustomers();
        System.out.println("---");
        System.out.println();

        theater.sellTicket(new RegularTicket(1, 1, "The Matrix", "C5"));
        theater.sellTicket(new VIPTicket(2, 2, "Jurassic Park", "A1", "Free Drinks"));
        theater.sellTicket(new RegularTicket(3, 3, "The Dark", "D8"));

        theater.printTickets();
        System.out.println("---");
        System.out.println();

        theater.addMovieScreening("The Matrix", "Friday 8PM");
        theater.addMovieScreening("Jurassic Park", "Saturday 6PM");

        theater.enrollCustomerInScreenings(1, "The Matrix");
        theater.enrollCustomerInScreenings(2, "Jurassic Park");
        theater.enrollCustomerInScreenings(3, "The Matrix");

        theater.printScreenings();
    }
}