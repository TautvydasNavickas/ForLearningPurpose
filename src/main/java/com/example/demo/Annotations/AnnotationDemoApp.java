package com.example.demo.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotations.xml");

        Coach coach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);
        Coach basketBallCoach = classPathXmlApplicationContext.getBean("basketBallCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        classPathXmlApplicationContext.close();
    }
}
