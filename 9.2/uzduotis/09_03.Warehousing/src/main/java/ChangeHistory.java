import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {
        ChangeHistory changeHistory = new ChangeHistory();

    }

    public void add(double status) {
        history.add(status);

    }

    public void clear() {
        history = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "History: " + history;
    }
}
