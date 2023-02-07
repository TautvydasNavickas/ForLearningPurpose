package com.example.demo.Annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data ={
            "Pirmas",
            "Antras",
            "Trečias",
            "Ketvirtas"
    };

    private Random random = new Random();


    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);

        String theFortune = data[index];
        return theFortune;
    }
}
