package com.example.demo.LessonsFromOneToSeven;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }



    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
       return fortuneService.getFortune();
    }

    @Override
    public String getKazkas() {
        return null;
    }


}
