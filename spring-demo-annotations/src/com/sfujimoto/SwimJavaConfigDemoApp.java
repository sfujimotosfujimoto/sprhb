package com.sfujimoto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sfujimoto on 2017/03/12.
 */
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach methods
        System.out.println("email: \t" + theCoach.getEmail());
        System.out.println("team: \t" + theCoach.getTeam());

        // close the context
        context.close();
    }
}
