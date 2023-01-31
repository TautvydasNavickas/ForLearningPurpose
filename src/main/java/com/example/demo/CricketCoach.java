package com.example.demo;

public class CricketCoach implements Coach{


    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("setter cricket email");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("setter cricket team");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("Cricket:Inside no-arg");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter cricket");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "15 min";
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
