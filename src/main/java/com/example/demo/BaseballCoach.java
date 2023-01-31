package com.example.demo;

public class BaseballCoach implements com.example.demo.Coach {

    private final com.example.demo.FortuneService fortuneService;

    public BaseballCoach(com.example.demo.FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }



    @Override
    public String getDailyWorkout() {
        return "Spend 30 min";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

    @Override

    public String getKazkas() {
        return "Hhaha";
    }

}
