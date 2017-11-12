package com.test.test4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/11/12.
 */
@Aspect
@Component
public class AspectConfig {
    @DeclareParents(value = "com.test.test4.Person+", defaultImpl = FemaleAnimal.class)
    public Animal animal;
}
