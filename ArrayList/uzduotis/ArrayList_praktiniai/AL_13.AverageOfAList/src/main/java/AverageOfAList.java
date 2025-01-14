
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }

        int sum = 0;
        int count = 0;
        for (int number : list) {
            sum += number;
            count++;
        }
        double average = (double) sum / count;

        System.out.println("Average: " + average);
        scanner.close();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

    }
}
