package com.test.test1;

import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class DancePerformance implements Performance {
    @Override
    public String perform() {
        System.out.println("DancePerformance");
        return "DancePerformance";
    }
}
