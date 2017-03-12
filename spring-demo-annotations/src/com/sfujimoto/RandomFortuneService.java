package com.sfujimoto;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

/**
 * Created by sfujimoto on 2017/03/12.
 */
@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune + " : " + index;

    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> RandomFortuneService: inside doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> RandomFortuneService: inside doMyCleanupStuff()");
    }
}
