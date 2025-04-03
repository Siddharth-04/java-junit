package bridgelabz.advanceJunitProblems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    static TemperatureConverter temperature;
    double DELTA = 0.001;

    @BeforeAll
    public static void setUp(){
        temperature = new TemperatureConverter();
    }

    @ParameterizedTest
    @CsvSource({
            "98.5,209.3",
            "32.4,90.32",
            "18.2,64.76"
    })
    public void shouldConvertCelsiusToFahrenheit(double celcius, double fahrenheit){
        assertEquals(fahrenheit,temperature.celciusToFahrenheitConversion(celcius),DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "113,45",
            "116,46.6667",
            "119,48.3333"
    })
    public void shouldConvertfahrenheitToCelcius(double fahrenheit, double celcius){
        assertEquals(celcius,temperature.fahrenheitToCelciusConversion(fahrenheit),DELTA);
    }
}
