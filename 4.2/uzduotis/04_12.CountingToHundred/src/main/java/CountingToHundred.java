
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println();
        int number = Integer.parseInt(reader.nextLine());
        reader.close();
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
