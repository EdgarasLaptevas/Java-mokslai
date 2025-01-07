
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(calc.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(calc.nextLine());
        calc.close();
        int sumNumbers = number1 + number2;
        int difNumbers = number1 - number2;
        int multiNumbers = number1 * number2;
        double divNumbers = (double) number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + sumNumbers);
        System.out.println(number1 + " - " + number2 + " = " + difNumbers);
        System.out.println(number1 + " * " + number2 + " = " + multiNumbers);
        System.out.println(number1 + " / " + number2 + " = " + divNumbers);

        // Write your program here

    }
}
