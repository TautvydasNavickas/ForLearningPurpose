package com.example.demo.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("handballCoach", HandBallCoach.class);

        System.out.println(coach.getDailyFortune());


        context.close();
    }
}
