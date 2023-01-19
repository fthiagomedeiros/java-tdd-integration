package com.integration.tests.integrationtests;

import com.integration.tests.integrationtests.business.Calculator;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@NoArgsConstructor
@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testSum() {
        Assertions.assertEquals(2, calculator.sum(1, 1));
    }
}
