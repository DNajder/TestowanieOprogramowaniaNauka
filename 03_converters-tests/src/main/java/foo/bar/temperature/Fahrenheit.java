package foo.bar.temperature;

import java.math.BigDecimal;

public class Fahrenheit implements TemperatureUnit{

    private final BigDecimal value;

    public Fahrenheit(BigDecimal value) {
        this.value = value.setScale(SCALE_TEMP,ROUNDING_MODE_TEMP);
    }

    public BigDecimal getValue() {
        return value;
    }
}
