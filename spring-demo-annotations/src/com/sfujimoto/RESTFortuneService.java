package com.sfujimoto;

import org.springframework.stereotype.Component;

/**
 * Created by sfujimoto on 2017/03/12.
 */
@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "This is fortune telling from RESTFortuneService!!";
    }
}
