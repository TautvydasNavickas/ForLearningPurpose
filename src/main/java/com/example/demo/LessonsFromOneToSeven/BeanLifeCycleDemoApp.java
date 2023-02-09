package com.example.demo.LessonsFromOneToSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("XML/beanLifeCycle.xml");

        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyFortune());



        classPathXmlApplicationContext.close();


        }


    }

