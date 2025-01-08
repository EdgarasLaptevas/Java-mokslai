package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int numberOfBox = numberOfCups / 3;
        int cupsLeft = numberOfCups % 3;
        System.out.println("Dėžių: " + numberOfBox);
        System.out.println("Liko puodelių: " + cupsLeft);

    }

}
