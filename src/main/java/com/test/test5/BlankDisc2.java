package com.test.test5;

import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */

public class BlankDisc2 implements Disc2 {
    @Override
    public void play(int trankNumber5,String s) {
        System.out.println("BlankDisc");
    }
}
