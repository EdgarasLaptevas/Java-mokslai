
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number");
        int number = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (number != 0) {
            count += 1;
            System.out.println("Give a number");
            number = Integer.parseInt(reader.nextLine());
            if (number == 0) {
                System.out.println("Number of numbers: " + count);
            }
        }
        reader.close();

    }
}
