package com.example.demo.LessonsFromOneToSeven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today lucky day";
    }

    @PostConstruct
    public void postFofo(){
        System.out.println("Inside postConstruct");
    }
    @PreDestroy
    public void preDestroyfofo(){
        System.out.println("Inside preDestroyfofo");
    }

}
