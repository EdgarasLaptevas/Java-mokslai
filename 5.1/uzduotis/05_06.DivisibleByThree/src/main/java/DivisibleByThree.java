
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("firstNumber:");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("secondNumber:");
        int secondNumber = Integer.parseInt(reader.nextLine());
        reader.close();

        divisibleByThreeInRange(firstNumber, secondNumber);

    }

    public static void divisibleByThreeInRange(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
