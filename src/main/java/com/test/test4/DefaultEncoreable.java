package com.test.test4;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/11/12.
 */
@Component
public class DefaultEncoreable implements Encoreable{

    @Override
    public void eat() {
        System.out.println("EncoreableIntroducer");
    }
}
