import java.security.Key;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e", "more precisely");

        printKeys(hashMap);
        printKeysWhere(hashMap, "i");
        printValuesOfKeysWhere(hashMap, "c");


    }

    public static void printKeys(HashMap<String, String> hashMap) {
        hashMap.forEach((key, value) -> System.out.println(key));
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.forEach((key, value) -> {
            if (key.contains(text)) {
                System.out.println(key);
            }
        });

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.forEach((key, value) -> {
            if (key.contains(text)) {
                System.out.println(value);
            }
        });
    }

}
