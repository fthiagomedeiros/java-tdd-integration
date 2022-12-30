package com.integration.tests.integrationtests.controller;

import com.integration.tests.integrationtests.business.Calculator;
import com.integration.tests.integrationtests.domain.Car;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
@AllArgsConstructor
public class HealthController {

    private Calculator calculator;

    @GetMapping
    public ResponseEntity<Car> getHello() {
        return new ResponseEntity<>(new Car("FORD2", 2022), HttpStatus.OK);
    }

    @GetMapping(value = "/sum")
    public ResponseEntity<Car> getSum() {
        return new ResponseEntity<>(new Car("Sum is", calculator.sum(1, 1)), HttpStatus.OK);
    }

}
