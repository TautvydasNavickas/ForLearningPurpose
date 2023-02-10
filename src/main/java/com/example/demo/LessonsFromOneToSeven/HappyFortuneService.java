package com.example.demo.LessonsFromOneToSeven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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
