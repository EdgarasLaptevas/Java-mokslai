
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(reader.nextLine());
        int countNegatives = 0;
        while (true) {
            if (number < 0) {
                countNegatives += 1;
                System.out.println("Give a number:");
                number = Integer.parseInt(reader.nextLine());
            } else if (number > 0) {
                System.out.println("Give a number:");
                number = Integer.parseInt(reader.nextLine());
            } else {
                System.out.println("Number of negative numbers: " + countNegatives);
                break;

            }
        }
        reader.close();
    }
}
