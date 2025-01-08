package lt.techin.praktinis;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double fahrenheit = temperatureCelsius * (9 / (double) 5) + 32;
        System.out.println(fahrenheit);
        // Write your program here
    }
}
