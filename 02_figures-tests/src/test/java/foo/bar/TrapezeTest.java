package foo.bar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TrapezeTest {

    @ParameterizedTest(name = "Area of Trapeze(({0}+{1})/2*{2}) should by {3}")
    @CsvSource({
            "2, 2, 4, 8",
            "2, 4, 6, 18",
            "5, 9, 3, 21"
    })
    void areaOfTrapeze(int a,int b, int h, int expectedArea){
        Trapeze trapeze = new Trapeze(a,b, h);
        assertEquals(expectedArea,trapeze.area(),"Area of Trapeze is different than expected");
    }

    @ParameterizedTest(name = "Circumference of Trapeze({0}+{1}+{2}+{3}) should by {4}")
    @CsvSource({
            "2, 3, 4, 9, 18",
            "5, 4, 8, 3, 20",
            "8, 12, 4, 7, 31"
    })
    void circumferenceOfTrapeze(int a, int b, int c,int d, int expectedCircumference){
        Trapeze trapeze = new Trapeze(a,b,c,d);
        assertEquals(expectedCircumference, trapeze.circumference(), "Circumference of Trapeze is different than expected");
    }
}