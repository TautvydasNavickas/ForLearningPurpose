package com.example.demo.LessonsFromOneToSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Coach theCoach = context.getBean("MyCoach", Coach.class);
        FortuneService fortuneService = context.getBean("myFortune", FortuneService.class);
        System.out.println(fortuneService.getFortune() + "ei tu");
        System.out.println(theCoach.getKazkas());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
