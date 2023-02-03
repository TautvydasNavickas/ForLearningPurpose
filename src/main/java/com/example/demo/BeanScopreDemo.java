package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopreDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanScope.xml");

        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        boolean result = (coach ==alphaCoach);

        System.out.println(result);

        System.out.println("memory location for coach" + coach);
        System.out.println("memory location for alphacoach" + alphaCoach);




    }
}
