import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("sense", new Book("Sense and Sensibility", 1811, "comedy"));
        hashMap.put("etc.", new Book("Pride and prejudice", 1813, "drama"));

        printValues(hashMap);
        printValueIfNameContains(hashMap, "prejud");
        // Test your program here!        

    }

    public static void printValues(HashMap<String, Book> hashMap) {
        hashMap.forEach((key, value) -> System.out.println(value));

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        hashMap.forEach((key, value) -> {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        });
    }
}
