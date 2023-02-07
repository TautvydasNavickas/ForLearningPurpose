package com.example.demo.Annotations;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class ReadFromText implements FortuneService{

    @Value("${foo.fortunes}$")
    private String[] data;

    @Override
    @PostConstruct
    public String getFortune() {
        System.out.print("ReadFromText file ");
       return String.join(" ", data);
    }
}

