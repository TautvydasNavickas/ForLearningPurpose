package com.example.demo.LessonsFromOneToSeven;

public class BaseballCoach implements Coach {

    private final FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {

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
