

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Give a number");
        int number = Integer.parseInt(read.nextLine());
        read.close();
        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }


        // Write your program here
    }
}
