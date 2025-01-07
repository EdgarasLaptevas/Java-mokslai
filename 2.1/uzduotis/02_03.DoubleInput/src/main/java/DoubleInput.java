
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        double giveNumber = Double.parseDouble(reader.nextLine());
        reader.close();
        System.out.println("You gave the number " + giveNumber);

        // write your program here

    }
}
