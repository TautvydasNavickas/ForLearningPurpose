package com.example.demo.Annotations;

public class OptimisticFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "You will be alright";
    }
}
