package com.test.test5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by mac on 2017/11/13.
 */
@Service("women2")
@Qualifier("women2")
public class Women implements Person {

    @Override
    public void say() {
        int a=5/0;
        System.out.println("I am a Women");
    }
}
