import java.util.HashMap;
import java.util.Map;

public class IOU {

    private Map<String, Double> map;

    public IOU() {
        map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (map.get(toWhom) == null) {
            return 0;
        }
        return map.get(toWhom);
    }
}
