package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int lastNumber = number % 10;
        int middleNumber = number % 100 / 10;
        int firstNumber = number / 100;
        System.out.println(lastNumber + middleNumber + firstNumber);


        // Write your program here
    }
}
