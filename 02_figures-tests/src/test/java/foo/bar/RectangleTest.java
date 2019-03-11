package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @ParameterizedTest(name = "Area of RectangleTest({0}*{1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 1, 1",
            "5, 5, 25"
    })
    void areaOfRectangle(int a, int b, int expectedArea) {
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(expectedArea, rectangle.area(), "Area of RectangleTest is different than expected");
    }

    @ParameterizedTest(name = "Area of RectangleTest({0}) should be {1}")
    @CsvSource({
            "0, 0, 0",
            "1, 4, 10",
            "5, 5, 20",
    })
    void circumferenceOfRectangle(int a, int b, int expectedCircumfrence) {
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(expectedCircumfrence, rectangle.circumference(), "Circumference of RectangleTest is different than expected");
    }
}
