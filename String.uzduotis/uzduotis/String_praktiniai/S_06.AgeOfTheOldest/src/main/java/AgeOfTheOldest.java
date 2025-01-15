
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ageStrings = new ArrayList<>();

        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                break;
            }
            String[] nameAge = userString.split(",");
            ageStrings.add(nameAge[1]);
        }
        ArrayList<Integer> ages = new ArrayList<>();
        for (String ageString : ageStrings) {
            ages.add(Integer.parseInt(ageString));
        }
        int oldest = -1;
        for (int age : ages) {
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);

        scanner.close();

    }
}
