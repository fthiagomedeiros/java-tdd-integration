package com.integration.tests.integrationtests.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Conditional(HasFriendProperty.class)
public class SpringNameConfiguration {

    @Bean
    @Conditional(HasFriendProperty.class)
    @Primary
    public Calculator fetchCalculator() {
        return new CalculatorImpl();
    }

}
