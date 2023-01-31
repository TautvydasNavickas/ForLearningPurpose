package com.example.demo;

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
