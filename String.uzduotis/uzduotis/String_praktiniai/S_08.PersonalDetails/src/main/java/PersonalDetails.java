
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dateStrings = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("")) {
                break;
            }
            String[] nameDate = userString.split(",");
            for (int i = 0; i < nameDate.length; i++) {
                if (i > 0) {
                    dateStrings.add(nameDate[1]);
                } else {
                    names.add(nameDate[0]);
                }

            }
        }
        int stringLength = 0;
        for (String name : names) {
            if (name.length() > stringLength) {
                stringLength = name.length();
            }
        }
        for (String name : names) {
            if (name.length() == stringLength) {
                System.out.println("Longest name: " + name);
            }
        }


        ArrayList<Integer> dates = new ArrayList<>();
        for (String dateString : dateStrings) {
            dates.add(Integer.parseInt(dateString));
        }
        int dateSum = 0;
        int dateCount = 0;
        for (int date : dates) {
            dateSum += date;
            dateCount++;
        }
        double averageDate = (double) dateSum / dateCount;
        System.out.println("Average of the birth years: " + averageDate);

        scanner.close();


    }
}
