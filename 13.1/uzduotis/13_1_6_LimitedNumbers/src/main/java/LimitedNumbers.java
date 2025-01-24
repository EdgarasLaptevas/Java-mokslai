import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }
            userNumbers.add(input);
        }
        List<Integer> numbersBetween = userNumbers.stream()
                .filter((number) -> number > 0 && number < 6)
                .collect(Collectors.toList());

        numbersBetween.forEach(System.out::println);

    }
}
