package com.sfujimoto;

/**
 * Created by sfujimoto on 2017/03/12.
 */
public class SadFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        return "Today is a sad day...";
    }
}
