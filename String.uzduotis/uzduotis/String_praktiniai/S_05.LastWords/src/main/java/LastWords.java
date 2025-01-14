
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                break;
            }
            String[] words = userString.split(" ");
            System.out.println(words[words.length - 1]);
        }
        scanner.close();


    }
}
