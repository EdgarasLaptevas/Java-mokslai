
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int r = 0; r < size; r++) {
            for (int s = 0; s < size; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        for (int r = 0; r < height; r++) {
            for (int s = 0; s < width; s++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // third part of the exercise
    }

    public static void printTriangle(int size) {
        String star = "";
        for (int row = 0; row < size; row++) {
            star += "*";
            System.out.print(star);
            System.out.println();
        }


        // fourth part of the exercise
    }
}
