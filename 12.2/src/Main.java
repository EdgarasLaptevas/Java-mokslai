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
        names.sort((Comparator.comparing(String::valueOf).reversed()));
        System.out.println(names);
        int count = 0;
        names.forEach((name) -> {
            name.contains("ALICE");
            count++;
        });


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