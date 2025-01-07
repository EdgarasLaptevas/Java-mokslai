
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(calc.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(calc.nextLine());
        System.out.println("Give the third number:");
        int number3 = Integer.parseInt(calc.nextLine());
        calc.close();
        double numAverage = (double) (number1 + number2 + number3) / 3;
        System.out.println("The average is " + numAverage);

        // Write your program here

    }
}
