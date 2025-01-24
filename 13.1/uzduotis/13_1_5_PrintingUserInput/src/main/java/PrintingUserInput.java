import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> userStrings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            userStrings.add(input);
        }

//        userStrings.forEach(System.out::println);
        userStrings.stream()
                .forEach(System.out::println);
    }
}
