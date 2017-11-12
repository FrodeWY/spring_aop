package com.test.test2;

import com.test.test1.Performance;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class VideoPerformance implements Performance {
    @Override
    public String perform() {
        System.out.println("VideoPerformance");
        return "VideoPerformance";
    }
}
