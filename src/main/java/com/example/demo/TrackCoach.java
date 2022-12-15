package com.example.demo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach () {

    }
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it" + fortuneService.getFortune();
    }

    @Override

    public String getKazkas() {
        return "Mahaha";
    }
}
