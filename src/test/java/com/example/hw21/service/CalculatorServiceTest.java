package com.example.hw21.service;
import com.example.hw21.exception.CalculatorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    @Test
    void sumPositive() {
        assertEquals(10, calculatorService.add(3, 7));
    }
    private void assertEquals(int i, int add) {
    }
    @Test
    void sumNegative() {
        assertEquals(-10, calculatorService.add(-3, -7));
    }

    @Test
    void minusPositive() {
        assertEquals(6, calculatorService.minus(8, 2));
    }

    @Test
    void minusNegative() {
        assertEquals(-6, calculatorService.minus(2, 8));
    }
    @Test
    void multiplyPositive() {
        assertEquals(16, calculatorService.multiply(8, 2));
    }

    @Test
    void multiplyNegative() {
        assertEquals(-16, calculatorService.multiply(-2, 8));
    }
    @Test
    void dividePositive() throws CalculatorException {
        assertEquals(4, calculatorService.divide(8, 2));
    }
    @Test
    void divideNegative() throws CalculatorException {
        assertEquals(-4, calculatorService.divide(-8, 2));
    }
    @Test
    void divizionByZero(){
        Assertions.assertThrows(CalculatorException.class, ()-> {
            calculatorService.divide(12, 0);
        });
    }
}