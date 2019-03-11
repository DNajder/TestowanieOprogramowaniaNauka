package foo.bar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("2 + 2 = 4")
    void addsTwoNumbers1() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2), "2+2 should equal 4");
    }

    @Test
    @DisplayName("2, -1 = -1")
    void extrakTwoNambers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.extract(2, 1), "2 ,1  should extract -1");
    }

    @Test
    @DisplayName("2 * 3 = 6")
    void multiply1() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    @DisplayName("3 * 5 = 15")
    void multiply2() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 should equal 15");
    }

    @Test
    @DisplayName("4 / 2 = 2")
    void divide1() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(4,2),"4 / 2 should equal 2");
    }
    @Test
    void shouldThrowSomeException() throws IllegalArgumentException{
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> new Calculator().divide(2,0));
        assertEquals("/ by zero", exception.getMessage());
        //calculator.divide(2,0);
        //fail("This method should throw IllegalArgumentException");
        // assertThrows(IllegalArgumentException);
    }
}
