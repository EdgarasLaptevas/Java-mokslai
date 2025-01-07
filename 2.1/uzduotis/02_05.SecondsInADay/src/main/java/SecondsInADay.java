
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner converter = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(converter.nextLine());
        long daysInSeconds = days * 24 * 60 * 60;
        System.out.println(daysInSeconds);

        // Write your program here

    }
}
