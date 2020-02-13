package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum")
    public Integer sum(@RequestParam Integer n1, Integer n2) {
        return n1 + n2;
    }

    @GetMapping("/substract")
    public Integer substract(@RequestParam Integer n1, Integer n2) {
        return n1 - n2;
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam Integer n1, Integer n2) {
        return n1 * n2;
    }

    @GetMapping("/devide")
    public Integer devide(@RequestParam Integer n1, Integer n2) {
        return n1 / n2;
    }
}