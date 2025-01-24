import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        Map<String, String> nickNames = new HashMap<>();

        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");

        nickNames.forEach((key, value) -> System.out.println(key + "'s nickname is " + value));
    }

}
