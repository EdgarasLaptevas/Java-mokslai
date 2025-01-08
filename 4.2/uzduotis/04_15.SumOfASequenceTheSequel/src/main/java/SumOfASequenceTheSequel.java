
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Second number? ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        reader.close();
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);

    }
}
