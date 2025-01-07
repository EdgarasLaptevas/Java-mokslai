
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(calc.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(calc.nextLine());
        calc.close();
        long result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);

        // Write your program here

    }
}
