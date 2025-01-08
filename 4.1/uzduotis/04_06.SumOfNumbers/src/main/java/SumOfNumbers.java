
import java.util.Calendar;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(calc.nextLine());
        int sumNumbers = 0;
        while (number != 0) {
            sumNumbers += number;
            System.out.println("Give a number:");
            number = Integer.parseInt(calc.nextLine());
            if (number == 0) {
                System.out.println("Sum of the numbers: " + sumNumbers);
            }
        }
        calc.close();
    }
}
