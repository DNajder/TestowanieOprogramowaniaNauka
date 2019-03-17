package foo.bar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest{
    @ParameterizedTest(name = "Area of Circle({0}) should by {1}")
    @CsvSource({
            "2, 12.56",
            "3, 28.26",
            "5, 78.5"
    })
    void areaOfCircle(int r, double expectedArea){
        Circle circle = new Circle(r);
        assertEquals(expectedArea,circle.area(),"Area of Circle is different than expected");
    }
    @ParameterizedTest(name = "Circumference of Circle({0}) should by {1}")
    @CsvSource({
            "2, 12.56",
            "5, 31.400000000000002",
            "8, 50.24"
    })
    void circumferenceOfCircle(int r,double expectedCircumference) {
        Circle circle = new Circle(r);
        assertEquals(expectedCircumference, circle.circumference(), "Circumference of Circle is different than expected");
    }

}
