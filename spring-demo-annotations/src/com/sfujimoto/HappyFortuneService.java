package com.sfujimoto;

import org.springframework.stereotype.Component;

/**
 * Created by sfujimoto on 2017/03/12.
 */

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
