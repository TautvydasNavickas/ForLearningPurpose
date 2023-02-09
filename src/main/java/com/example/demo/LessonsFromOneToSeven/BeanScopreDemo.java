package com.example.demo.LessonsFromOneToSeven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopreDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("XML/beanScope.xml");

        Coach coach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach alphaCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);

        Coach coachHome = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);
        Coach coachHomeSecond = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);




        boolean result = (coach ==alphaCoach);

        boolean resultHome = (coachHome == coachHomeSecond);

        System.out.println(resultHome);



        System.out.println("memory location for coach" + coachHome);
        System.out.println("memory location for alphacoach" + coachHomeSecond);




    }
}
