package com.example.demo.Annotations;

public class HandBallCoach implements Coach{

    FortuneService fortuneService;

    public HandBallCoach(FortuneService fortuneService) {
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
}
