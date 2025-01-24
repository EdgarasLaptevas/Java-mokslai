import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    Map<String, String> list;

    public Abbreviations() {
        list = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        list.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return list.containsKey(abbreviation);

    }

    public String findExplanationFor(String abbrevation) {
        return list.get(abbrevation);
    }
}
