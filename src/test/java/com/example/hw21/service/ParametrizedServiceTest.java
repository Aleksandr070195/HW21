package com.example.hw21.service;

import com.example.hw21.exception.CalculatorException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedServiceTest{
    CalculatorService calculatorService = new CalculatorService();
    Stream <Arguments> data(){
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(31,6),
                Arguments.of(-123,482),
                Arguments.of(23,2929),
                Arguments.of(1223,-101));
    }
    @ParameterizedTest
    @MethodSource("data")
    void add(int num1, int num2){
        int excepted = num1 + num2;
        int actual = calculatorService.add(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int num1, int num2){
        int excepted = num1 - num2;
        int actual = calculatorService.minus(num1, num2);
        assertEquals(excepted, actual);
    }

    private void assertEquals(int excepted, int actual) {
    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(int num1, int num2){
        int excepted = num1 * num2;
        int actual = calculatorService.multiply(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int num1, int num2) throws CalculatorException {
        int excepted = num1 / num2;
        int actual = calculatorService.divide(num1, num2);
        assertEquals(excepted, actual);
    }
}
