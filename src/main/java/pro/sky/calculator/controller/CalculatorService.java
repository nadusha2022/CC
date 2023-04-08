package pro.sky.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus (int n, int g) {
        return n + g;
    }
    public int minus (int n, int g) {
        return n - g;
    }
    public int multiply(int n, int g) {
        return n * g;
    }

    public double devide (int n, int g) {
        return n / (double) g;
    }
}



