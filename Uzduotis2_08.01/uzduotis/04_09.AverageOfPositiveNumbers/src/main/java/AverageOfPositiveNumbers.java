
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(reader.nextLine());
        int countPositive = 0;
        int sumPositive = 0;
        while (number != 0) {
            if (number > 0) {
                countPositive += 1;
                sumPositive += number;
            }
            System.out.println("Give a number:");
            number = Integer.parseInt(reader.nextLine());
        }
        if (countPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumPositive / countPositive);
        }
    }
}
