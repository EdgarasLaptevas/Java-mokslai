
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ageStrings = new ArrayList<>();
        ArrayList<String> nameAgeStrings = new ArrayList<>();

        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                break;
            }
            String[] nameAge = userString.split(",");
            nameAgeStrings.add(Arrays.toString(nameAge));
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
        String oldestText = Integer.toString(oldest);
        for (String nameAgeString : nameAgeStrings) {
            if (nameAgeString.contains(oldestText)) {
                nameAgeString = nameAgeString.substring(1, nameAgeString.length() - 1);
                String[] nameAge = nameAgeString.split(",");
                System.out.println(nameAge[0]);
            }
        }
        scanner.close();

    }
}
