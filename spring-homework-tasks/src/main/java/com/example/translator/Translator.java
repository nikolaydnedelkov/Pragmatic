package com.example.translator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Translator {
    private String fromLang;
    private String toLang;
    private String text;

}
