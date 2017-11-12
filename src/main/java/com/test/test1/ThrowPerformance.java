package com.test.test1;

import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class ThrowPerformance implements Performance {
    @Override
    public String perform() {
        int a=5/0;
        return "ThrowPerformance";
    }

}
