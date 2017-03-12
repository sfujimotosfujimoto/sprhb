package com.sfujimoto;

import org.springframework.stereotype.Component;

/**
 * Created by sfujimoto on 2017/03/12.
 */

@Component
public class KendoCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice Suburi ";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
