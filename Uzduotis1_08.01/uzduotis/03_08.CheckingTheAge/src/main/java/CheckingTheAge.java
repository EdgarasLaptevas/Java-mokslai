
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(read.nextLine());
        read.close();
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }


    }
}
