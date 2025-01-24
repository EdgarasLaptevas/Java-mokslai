import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        int count = 0;
        // Write your program here

        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
            count++;
        }
        int sum = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        double average = (double) sum / count;

        System.out.println("average of the numbers: " + average);

    }
}