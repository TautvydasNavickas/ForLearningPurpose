package com.example.demo.Annotations;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Component
public class ReadFromTextFile implements FortuneService{

    String file = "C:/Users/tautv/Desktop/fortune.data.txt";

    private ArrayList<String> data= new ArrayList();

    public void addingFromTextFile() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while(bufferedReader.readLine() != null) {
                data.add(bufferedReader.readLine());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    @PostConstruct
    @Override
    public String getFortune() {
        addingFromTextFile();
        System.out.print("ReadFromTextFile: ");
        return String.join(" ", data);
    }
}
