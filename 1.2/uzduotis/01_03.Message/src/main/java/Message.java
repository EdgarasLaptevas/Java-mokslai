
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = reader.nextLine();
        reader.close();
        System.out.println(message);

    }
}
