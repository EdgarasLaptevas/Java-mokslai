
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    static String value = "Value: ";

    public static void main(String[] args) {
        Func<Integer, String> intToString = (val) -> value + val;
        Mano<Integer> isEven = (val) -> val % 2 == 0;
        Consumer<String> printMessage = (string) -> System.out.println(string + " is awesome!");
        Supplier<String> randomGreeting = () -> {
            String[] greetings = {"Hi", "Hello", "Hey"};
            Random random = new Random();
            return greetings[random.nextInt(greetings.length)];

        };

        System.out.println(intToString.apply(5));
        System.out.println(isEven.test(7));
        printMessage.accept("Java");
        System.out.println(randomGreeting.get());
    }
}