import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.parseInt(input));
        }

        int positiveNumbersSum = numbers.stream()
                .filter((number) -> number >= 0)
                .mapToInt((number) -> number)
                .sum();

        long positiveNumberCount = numbers.stream()
                .filter((number) -> number >= 0)
                .count();

        double average = (double) positiveNumbersSum / positiveNumberCount;

        double negativeNumbersAv = numbers.stream()
                .mapToInt((number) -> number)
                .filter((number) -> number < 0)
                .mapToDouble((number) -> number)
                .average()
                .orElse(0.0);

        System.out.println("Print average of the numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + average);
        } else if (input.equals("n")) {
            System.out.println("Average of the negative numbers " + negativeNumbersAv);
        }

    }


}

