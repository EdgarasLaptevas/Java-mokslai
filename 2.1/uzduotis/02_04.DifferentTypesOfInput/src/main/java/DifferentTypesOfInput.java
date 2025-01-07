
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String message = scan.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double numberD = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean answer = scan.nextBoolean();
        scan.close();
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + numberD);
        System.out.println("You gave the boolean " + answer);


        // Write your program here

    }
}
