import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String tvShow = scanner.nextLine();
            if (tvShow.equals("")) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram program = new TelevisionProgram(tvShow, duration);
            programs.add(program);
        }

        System.out.println("Program's maximum duration? ");
        int duration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (duration >= program.getDuration()) {
                System.out.println(program);
            }

        }

    }
}
