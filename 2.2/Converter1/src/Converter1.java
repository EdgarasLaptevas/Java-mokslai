import java.util.Scanner;

public class Converter1 {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = Double.parseDouble(calc.nextLine());
        calc.close();
        double km = miles * 1.609344;
        System.out.println(miles + " miles is " + km + "kilometers");

    }
}