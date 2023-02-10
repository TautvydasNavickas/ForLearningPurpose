package com.example.demo.Annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("readFromTextFile")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }

    @PostConstruct
    public void postFofo(){
        System.out.println("Inside postConstruct");
    }
    @PreDestroy
    public void preDestroyfofo(){
        System.out.println("Inside preDestroyfofo");
    }


    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
