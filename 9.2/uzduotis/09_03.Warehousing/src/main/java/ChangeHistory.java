import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        changeHistory = new ArrayList<>();

    }

    public void add(double status) {
        changeHistory.add(status);

    }

    public void clear() {
        changeHistory.clear();
    }

    @Override
    public String toString() {
        return "" + changeHistory;
    }

    public double maxValue() {
        double largest = 0;
        if (changeHistory.isEmpty()) {
            return 0;
        }
        for (Double history : changeHistory) {
            if (history > largest) {
                largest = history;
            }
        }
        return largest;
    }

    public double minValue() {
        if (changeHistory.isEmpty()) {
            return 0;
        }
        double smallest = changeHistory.get(0);
        for (Double history : changeHistory) {
            if (history < smallest) {
                smallest = history;
            }
        }
        return smallest;
    }

    public double average() {
        int sum = 0;
        int count = 0;
        if (changeHistory.isEmpty()) {
            return 0;
        }
        for (Double history : changeHistory) {
            sum += history;
            count++;
        }
        return (double) sum / count;
    }


}
