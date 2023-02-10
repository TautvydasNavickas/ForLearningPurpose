package com.example.demo.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomArrayFortuneService implements FortuneService{
    @Value("${foo.fortunes}$")
    private String[] data;
   private Random random = new Random();
    @Override
    public String getFortune() {
        return data[random.nextInt(data.length)];

    }
}
