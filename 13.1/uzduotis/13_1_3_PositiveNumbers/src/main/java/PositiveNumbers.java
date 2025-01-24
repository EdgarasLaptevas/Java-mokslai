import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

       
        System.out.println(positive(numbers));


    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter((number) -> number > 0)
                .collect(Collectors.toList());
    }

}
