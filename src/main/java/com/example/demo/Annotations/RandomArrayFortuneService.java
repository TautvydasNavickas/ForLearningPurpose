package com.example.demo.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomArrayFortuneService implements FortuneService{

    @Value("${foo.fortunes}")
    private String[] myArray;
    private final Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(myArray.length);
        return myArray[index];
    }
}
