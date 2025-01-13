public class Clock {

    public static void main(String[] args) {
        clock(3);
    }

    public static void clock(int hours) {
        for (int h = 0; h < hours; h++)
            for (int s = 0; s <= 60; s++) {
                System.out.println(String.format("%02d", h) + ":" + String.format("%02d", s));
            }
    }
}
