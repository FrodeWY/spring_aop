package com.test.test3;

import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class BlankDisc implements Disc {
    @Override
    public void play(int trankNumber5,String s) {
        System.out.println("BlankDisc");
    }
}
