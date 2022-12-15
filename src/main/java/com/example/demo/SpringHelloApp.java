package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Coach theCoach = context.getBean("MyCoach", Coach.class);
        System.out.println(theCoach.getKazkas());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
