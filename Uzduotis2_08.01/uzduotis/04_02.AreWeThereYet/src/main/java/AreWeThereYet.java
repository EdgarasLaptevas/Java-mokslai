
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(reader.nextLine());
        while (number != 4) {
            System.out.println("Give a number:");
            number = Integer.parseInt(reader.nextLine());
        }


    }
}
