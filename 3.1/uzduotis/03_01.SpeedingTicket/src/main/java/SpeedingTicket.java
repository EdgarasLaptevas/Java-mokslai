
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = Integer.parseInt(reader.nextLine());
        reader.close();
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }

        // Write your program here. 
    }
}
