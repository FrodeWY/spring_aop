package com.test.test3;

import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class WriterDisc implements Disc {
    @Override
    public void play(int Number,String s) {
        System.out.println("WriterDisc");
    }
}
