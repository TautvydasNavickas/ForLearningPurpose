package com.example.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    String[] cars = {"Pirmas", "Antras", "Trecias", "Ketivrtas", "penktas", "asd", "fff"};
    Random generator = new Random();
    int randomIndex = generator.nextInt(cars.length);
    @Override
    public String getFortune() {
        return cars[randomIndex];
    }


}
