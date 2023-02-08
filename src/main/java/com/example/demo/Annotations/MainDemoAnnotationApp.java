package com.example.demo.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoAnnotationApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("handballCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
