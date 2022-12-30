package com.integration.tests.integrationtests.business;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    @Override
    public int difference(int value1, int value2) {
        return value1 - value2;
    }

    @Override
    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int divide(int value1, int value2) {
        return value1 / value2;
    }
}
