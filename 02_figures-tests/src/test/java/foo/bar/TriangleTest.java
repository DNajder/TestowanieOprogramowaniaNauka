package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @ParameterizedTest(name = "Area of Triangle({0}*{1}) should by {2}")
    @CsvSource({
            "2, 2, 4",
            "3, 4, 12",
            "5, 9, 45"
    })
    void areaOfTriangle(int a, int h, int expectedArea){
        Triangle triangle = new Triangle(a,h);
        assertEquals(expectedArea,triangle.area(),"Area of Triangle is different than expected");
    }
    @ParameterizedTest(name = "Circumference of Triangle({0}+{1}+{2}) should by {3}")
    @CsvSource({
            "2, 3, 4, 9",
            "5, 4, 8, 17",
            "8, 15, 4, 0"
    })
    void circumferenceOfTriangle(int a, int b, int c, int expectedCircumference){
        Triangle triangle = new Triangle(a,b,c);
        assertEquals(expectedCircumference, triangle.circumference(), "Circumference of Triangle is different than expected");
    }

}
