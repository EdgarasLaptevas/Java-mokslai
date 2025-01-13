public class MultiplicationTable {

    public static void main(String[] args) {
        multiplicationTable(9);
    }

    public static void multiplicationTable(int number) {
        System.out.print("    ");
        for (int i = 1; i <= number; i++) {
            if (number < 10) {
                System.out.print("  " + i + " ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();

        String line = "-----";
        for (int i = 1; i <= number; i++) {
            System.out.print(line);
        }
        System.out.println();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= number; j++) {
                int multiplication = j * i;
                int length = (int) (Math.log10(multiplication) + 1);
//                if (multiplication < 10) {
//                    System.out.print("  " + multiplication + " ");
//                } else {
//                    System.out.print(" " + multiplication + " ");
//                }
                String space = " ";
                for (int s = 1; s <= length; s++) {
                    space += " ";
                }
                System.out.print(space + multiplication + " ");
            }
            System.out.println();
        }
    }
}