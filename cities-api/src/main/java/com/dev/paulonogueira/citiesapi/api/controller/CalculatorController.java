package com.dev.paulonogueira.citiesapi.api.controller;

import com.dev.paulonogueira.citiesapi.infrastructure.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculators")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/by-point")
    public ResponseEntity<Double> byPoint(@RequestParam(name = "from") final long fromCity,
                                         @RequestParam(name = "to") final long toCity) {
        Double result = calculatorService.calculeByPointInMiles(fromCity, toCity);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/by-cube")
    public ResponseEntity<Double> byCube(@RequestParam(name = "from") final long fromCity,
                         @RequestParam(name = "to") final long toCity){
        Double result = calculatorService.calculeByCubeInMeters(fromCity, toCity);
        return ResponseEntity.ok(result);
    }
}
