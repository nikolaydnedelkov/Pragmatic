package com.example.translator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslatorContoller {

    @GetMapping("/translate")
    public String translate(@RequestParam String fromLang, String toLang, String text) {
        try {
            return TranslatorUtils.translate(fromLang, toLang, text);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }

}
