package ch.hslu.oop.sw06_polymorphie_unittest.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final CalculatorInterface calc = new Calculator();

    @Test
    void additionOfZeroAndZero() {
        assertEquals(0, calc.addition(0, 0), "0 + 0 sollte 0 ergeben");
    }

    @Test
    void additionOfZeroAndOne() {
        assertEquals(1, calc.addition(0, 1), "0 + 1 sollte 1 ergeben");
    }

    @Test
    void additionOfOneAndZero() {
        assertEquals(1, calc.addition(1, 0), "1 + 0 sollte 1 ergeben");
    }

    @Test
    void additionOfMinusOneAndOne() {
        assertEquals(0, calc.addition(-1, 1), "-1 + 1 sollte 0 ergeben");
    }

    @Test
    void additionOfTenAndTwo() {
        assertEquals(12, calc.addition(10, 2), "10 + 2 sollte 12 ergeben");
    }

    @Test
    void additionOfTenAndMinusTwentyTwo() {
        assertEquals(-12, calc.addition(10, -22), "10 + -22 sollte -12 ergeben");
    }

    @Test
    void additionOfOneAndOverflow() {
        assertEquals(2L * Integer.MAX_VALUE, calc.addition(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }


}
