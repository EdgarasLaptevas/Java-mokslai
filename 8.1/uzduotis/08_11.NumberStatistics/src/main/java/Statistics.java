
public class Statistics {
    private int count;
    private int sumEven;
    private int sumOdd;
    private int sum;

    public Statistics() {

    }

    public int addNumber(int number) {
        count++;
        sum += number;
        if (number % 2 == 0) {
            return sumEven += number;
        }
        return sumOdd += number;
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return (double) sum / count;
    }

    public int getSumEvenNumbers() {
        return sumEven;
    }

    public int getSumOddNumbers() {
        return sumOdd;
    }
}
