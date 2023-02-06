package com.example.demo.LessonsFromOneToSeven;


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

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside doMyStartUpStuff");
    }

    public void doMyStartUpStuffYoYo(){
        System.out.println("TrackCoach: inside yoyo");
    }



}


