package com.test.test4;

import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/11/12.
 */
@Component
public class FemaleAnimal implements Animal {
    @Override
    public void eat() {
        System.out.println("我是雌性，我比雄性更喜欢吃零食");
    }
}
