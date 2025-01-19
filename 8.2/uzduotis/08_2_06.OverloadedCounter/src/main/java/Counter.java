import java.nio.channels.Pipe;

public class Counter {
    int counter;

    public Counter(int startValue) {
        counter = startValue;
    }

    public Counter() {
        counter = 0;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public void increase(int increase) {
        if (increase >= 0) {
            counter += increase;
        }
    }

    public void decrease(int decrease) {
        if (decrease >= 0) {
            counter -= decrease;
        }
    }
}
