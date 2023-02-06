package com.example.demo.LessonsFromOneToSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(tennisCoach.getDailyFortune());


        context.close();
    }
}
