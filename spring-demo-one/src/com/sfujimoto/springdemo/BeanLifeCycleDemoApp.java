package com.sfujimoto.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sfujimoto on 2017/03/11.
 */
public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {


        // load the spring configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");




        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
