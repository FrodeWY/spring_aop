package com.test.test4;

import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/11/12.
 */
@Component("women")
public class Women implements Person {
    @Override
    public void likePerson() {
        System.out.println("我是女生，我喜欢帅哥");
    }
}
