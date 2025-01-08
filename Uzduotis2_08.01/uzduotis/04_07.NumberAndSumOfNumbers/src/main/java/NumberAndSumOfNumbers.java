
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Give a number");
        int number = Integer.parseInt(calc.nextLine());
        int countNumbers = 0;
        int countSum = 0;
        while (number != 0) {
            countNumbers += 1;
            countSum += number;
            System.out.println("Give a number");
            number = Integer.parseInt(calc.nextLine());
            if (number == 0) {
                System.out.println("Number of numbers: " + countNumbers);
                System.out.println("Sum of the numbers: " + countSum);
                
            }
        }
        calc.close();
    }
}
