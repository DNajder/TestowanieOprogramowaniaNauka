package foo.bar.temperature;

import java.math.BigDecimal;

public class Celsius implements TemperatureUnit {
    public static final BigDecimal CELCIUS_TO_KELVIN =
            new BigDecimal("273.15").setScale(SCALE_TEMP,ROUNDING_MODE_TEMP);
    public static final BigDecimal CELCIUS_TO_FAHRENHEIT =
            new BigDecimal("273.15").setScale(SCALE_TEMP,ROUNDING_MODE_TEMP);

    private final BigDecimal value;

    public Celsius(BigDecimal value) {
        if ((BigDecimal.ZERO.compareTo(value))<273){
            throw new IllegalArgumentException("wartość zbyt mała");
        }
        this.value = value.setScale(SCALE_TEMP,ROUNDING_MODE_TEMP);
    }

    public BigDecimal getValue() {
        return value;
    }
    public Kelvin toKalvin(){
        return new Kelvin(value.add(CELCIUS_TO_KELVIN).setScale(SCALE_TEMP,ROUNDING_MODE_TEMP));
    }
    public Fahrenheit toFahrenheit(){
        return new Fahrenheit(value);
    }
}
