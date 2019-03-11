package foo.bar.temperature;

import java.math.BigDecimal;

public class Kelvin implements TemperatureUnit{
    public Kelvin(BigDecimal valeu) {
        this.valeu = valeu.setScale(SCALE_TEMP,ROUNDING_MODE_TEMP);
    }

    private final BigDecimal valeu;

    public BigDecimal getValeu() {
        return valeu;
    }
}
