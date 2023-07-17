package com.example.hw21.service;

import com.example.hw21.exception.CalculatorException;
import com.example.hw21.exception.CalculatorException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws CalculatorException {
        if (b == 0) throw new CalculatorException();
        return a / b;
    }
}

