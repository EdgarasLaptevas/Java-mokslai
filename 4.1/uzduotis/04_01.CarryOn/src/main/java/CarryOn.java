
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shall we carry on?");
        String answer = reader.nextLine();
        while (!answer.equals("no")) {
            System.out.println("Shall we carry on?");
            answer = reader.nextLine();
        }

    }
}
