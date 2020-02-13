package com.example.date.day.convertor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DateDayConvertorControler {

    @GetMapping("/date")
    public String inputDate(@RequestParam Integer year, Integer month, Integer day) {
        LocalDate a = LocalDate.of(year, month, day);

        return (a.getDayOfWeek().name());
    }

}
