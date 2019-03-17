package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {
    @ParameterizedTest(name = "Area of Diamond({0}*{1}) should be {2}")
    @CsvSource({
            "2, 3, 6",
            "4, 4, 16",
            "5, 4, 20"
    })
    void areaOfDiamond(int a, int h, int expectedArea) {
       Diamond diamond = new Diamond(a,h);
        assertEquals(expectedArea, diamond.area(), "Area of Diamond is different than expected");
    }

    @ParameterizedTest(name = "Circumference of Diamond({0}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "2, 4, 8",
            "5, 3, 20",
    })
    void circumferenceOfDiamond(int a, int h, int expectedCircumfrence) {
        Diamond diamond = new Diamond(a,h);
        assertEquals(expectedCircumfrence, diamond.circumference(), "Circumference of Diamond is different than expected");

    }
}
