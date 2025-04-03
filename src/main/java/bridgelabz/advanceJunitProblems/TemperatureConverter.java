package bridgelabz.advanceJunitProblems;

public class TemperatureConverter {
    public double celciusToFahrenheitConversion(double celcius) {
        double fahrenheit = (celcius*9)/5 + 32;
        return fahrenheit;
    }

    public double fahrenheitToCelciusConversion(double fahrenheit) {
        double celcius = (fahrenheit - 32) / 1.8;
        return celcius;
    }
}
