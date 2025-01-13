
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("Give first index");
        int firstIndex = Integer.parseInt(reader.nextLine());
        System.out.println("Give second index");
        int secondIndex = Integer.parseInt(reader.nextLine());
        reader.close();


        // Implement here
        // asking for the two indices
        // and then swapping them

        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
