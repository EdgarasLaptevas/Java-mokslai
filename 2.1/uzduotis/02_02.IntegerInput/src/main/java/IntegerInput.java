
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int giveNumber = Integer.parseInt(reader.nextLine());
        reader.close();
        System.out.println("You gave the number " + giveNumber);

        // write your program here

    }
}
