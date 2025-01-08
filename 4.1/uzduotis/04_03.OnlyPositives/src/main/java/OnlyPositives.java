
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(reader.nextLine());
            if (number < 0) {
                System.out.println("Unsuitable number");
            } else if (number > 0) {
                int powerNumber = (int) Math.pow(number, 2);
                System.out.println(powerNumber);
            } else {
                break;
            }


        }
    }
}
