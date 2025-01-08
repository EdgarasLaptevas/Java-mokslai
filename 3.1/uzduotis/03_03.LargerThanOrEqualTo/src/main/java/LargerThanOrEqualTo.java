
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(read.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(read.nextLine());
        read.close();
        if (number1 > number2) {
            System.out.println("Greater number is: " + number1);
        } else if (number1 == number2) {
            System.out.println("The number are equal!");
        } else {
            System.out.println("Greater number is: " + number2);
        }


    }
}
