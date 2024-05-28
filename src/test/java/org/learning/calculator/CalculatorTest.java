package org.learning.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals((float) 4.9, calc.add((float) 1.5 ,(float) 3.4));
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        assertEquals( 0.9f, calc.subtract( 2.5f , 1.6f));
    }

    @Test
    void divide() {
        Calculator calc = new Calculator();
        assertEquals((float) 2.5, calc.divide(5, 2));
        assertThrows(IllegalArgumentException.class, ()-> calc.divide(4, 0));
    }

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(10.6f, calc.multiply(5.3f, 2));
    }
}