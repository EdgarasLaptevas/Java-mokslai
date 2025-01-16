
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics oddNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();

        while (true) {
            System.out.println("Enter numbers:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
            oddNumbers.addNumber(number);
            evenNumbers.addNumber(number);
        }
//        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.getSum());
//        System.out.println("Average: " + statistics.getAverage());
        System.out.println("Sum of even numbers: " + evenNumbers.getSumEvenNumbers());
        System.out.println("Sum of odd numbers: " + oddNumbers.getSumOddNumbers());

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

    }
}
