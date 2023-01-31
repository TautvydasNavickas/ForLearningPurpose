package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        FortuneService fortuneService = new RandomFortuneService();


        System.out.println(coach.getDailyFortune());
        System.out.println(fortuneService.getFortune());


        context.close();
    }
}
