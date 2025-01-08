
import java.sql.SQLOutput;
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first string");
        String string1 = read.nextLine();
        System.out.println("Enter the second string");
        String string2 = read.nextLine();
        read.close();
        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }


        // Write your program here. 
    }
}
