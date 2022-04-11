package com.example.demo.service;

import com.example.demo.model.RawData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CalculatorService {
    public Integer compute(RawData rawData) {
        switch (rawData.getOperatie()) {
            case ADUNARE:
                return rawData.getNumbers().stream().reduce(0, Integer::sum);
            case SCADERE:
                return (-1) * rawData.getNumbers().stream().reduce(0, Integer::sum);
            case INMULTIRE:
                return rawData.getNumbers().stream().reduce(1, (a, b) -> a * b);
            case IMPARTIRE:
                return rawData.getNumbers().stream().reduce(rawData.getNumbers().get(0), (a, b) -> a / b);
            default:
                return -1;
        }
    }
}
