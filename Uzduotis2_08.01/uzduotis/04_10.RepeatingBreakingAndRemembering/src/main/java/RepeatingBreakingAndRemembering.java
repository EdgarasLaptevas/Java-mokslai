
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner calc = new Scanner(System.in);
        System.out.println("Write numbers:");
        int number = Integer.parseInt(calc.nextLine());
        int sumNumbers = 0;
        int countNumbers = 0;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        while (number != -1) {
            sumNumbers += number;
            countNumbers += 1;
            if (number % 2 == 0) {
                countEvenNumbers += 1;
            } else {
                countOddNumbers += 1;
            }
            System.out.println("Write numbers:");
            number = Integer.parseInt(calc.nextLine());
            if (number == -1) {
                double average = (double) sumNumbers / countNumbers;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sumNumbers);
                System.out.println("Numbers: " + countNumbers);
                System.out.println("Average: " + average);
                System.out.println("Even: " + countEvenNumbers);
                System.out.println("Odd: " + countOddNumbers);
            }
        }

    }
}
