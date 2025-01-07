
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String nameMessage = reader.nextLine();
        System.out.println("What is their job?");
        String jobMessage = reader.nextLine();
        reader.close();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + nameMessage + ", who was " + jobMessage + ".");
        System.out.println("On the way to work, " + nameMessage + " reflected on life.");
        System.out.println("Perhaps " + nameMessage + " will not be " + jobMessage + " forever.");

        // Write your program here

    }
}
