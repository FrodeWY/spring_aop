package com.test.test1.sub;

import com.test.test1.Performance;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
public class SongPerformance implements Performance {
    @Override
    public String perform() {
        System.out.println("SongPerformance");
        return  "SongPerformance";
    }
}
