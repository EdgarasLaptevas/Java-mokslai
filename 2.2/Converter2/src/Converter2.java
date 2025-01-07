import java.util.Scanner;

public class Converter2 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        long minutes = Long.parseLong(calc.nextLine());
        calc.close();
        int years = (int) (minutes / 60 / 24 / 365);
        int days = (int) (minutes / 60 / 24 % 365);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}