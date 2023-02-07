package com.example.demo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return null;
    }
}
