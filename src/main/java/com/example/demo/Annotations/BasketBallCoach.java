package com.example.demo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Shoot!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
