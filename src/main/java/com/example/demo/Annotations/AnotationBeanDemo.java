package com.example.demo.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationBeanDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contet = new ClassPathXmlApplicationContext("XML/annotations.xml");
        Coach coach = contet.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coach.getDailyFortune());
        contet.close();
    }
}
