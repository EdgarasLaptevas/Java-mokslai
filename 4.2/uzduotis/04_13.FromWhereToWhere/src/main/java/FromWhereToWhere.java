
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Where to? ");
        int whereTo = Integer.parseInt(reader.nextLine());
        System.out.println("Where from? ");
        int whereFrom = Integer.parseInt(reader.nextLine());
        reader.close();
        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);
        }

        // Write your program here
    }
}
