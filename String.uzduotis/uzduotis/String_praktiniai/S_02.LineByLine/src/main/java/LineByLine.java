
import java.util.Arrays;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                break;
            }
            String[] stringArray = userString.split(" ");
            for (String word : stringArray) {
                System.out.println(word);
            }
            scanner.close();
        }
    }
}
