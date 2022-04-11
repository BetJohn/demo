package com.example.demo.controller;


import com.example.demo.model.RawData;
import com.example.demo.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RawDataController {
    private final CalculatorService calculatorService;
    @PostMapping
    public Integer compute(@RequestBody RawData rawData){
        return calculatorService.compute(rawData);
    }
}
