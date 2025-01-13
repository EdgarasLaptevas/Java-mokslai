public class WeeksAndDays {

    public static void main(String[] args) {
        weekDays(4);
    }

    public static void weekDays(int week) {
        int days = 7;
        for (int i = 1; i <= week; i++) {
            System.out.println("Week " + i);
            for (int d = 1; d <= days; d++) {
                spaces(7);
                System.out.println("Day " + d);
            }
        }
    }

    public static void spaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

}