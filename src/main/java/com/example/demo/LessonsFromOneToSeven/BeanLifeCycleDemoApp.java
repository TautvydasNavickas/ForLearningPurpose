package com.example.demo.LessonsFromOneToSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanLifeCycle.xml");

        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyFortune());



        classPathXmlApplicationContext.close();


        }


    }

