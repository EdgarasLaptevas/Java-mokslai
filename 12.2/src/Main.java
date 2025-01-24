import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Robert");
        names.add("Joni");
        names.add("Alice");

        names.forEach((name) -> System.out.println("Name: " + name));
        names.removeIf((name) -> name.length() < 4);
        System.out.println(names);
        names.replaceAll((name) -> name.toUpperCase());
        System.out.println(names);
//        names.replaceAll((name) -> name + "_done");
        System.out.println(names);
        names.removeIf((name) -> name.contains("H"));
        System.out.println(names);
        names.sort((Comparator.comparing(name -> name.charAt(name.length() - 1))));
        names.sort((name1, name2) -> Character.compare(name1.charAt(name1.length() - 1), name2.charAt(name2.length() - 1)));
        System.out.println(names);

        final Integer[] count = {0};
        names.forEach((name) -> {
            if (name.contains("ALICE")) {
                count[0]++;
            }
        });
        System.out.println("The word ALICE appears " + count[0] + " times.");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        numbers.removeIf((number) -> number % 2 == 0);
        System.out.println(numbers);
        numbers.sort((Comparator.comparing(Integer::intValue).reversed()));
        System.out.println(numbers);
        numbers.replaceAll((number) -> (int) Math.pow(number, 2));
        System.out.println(numbers);

    }

}