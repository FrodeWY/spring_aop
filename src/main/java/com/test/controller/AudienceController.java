package com.test.controller;

import com.test.test1.Performance;
import com.test.test4.Encoreable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 2017/11/13.
 */
@Controller
public class AudienceController {
    @Autowired
//    @Qualifier("songPerformance")
    @Qualifier("aroundPerformance")
    private Performance performance;
    @RequestMapping("/audience")
    public @ResponseBody
    String performance(){
        Encoreable encoreable= (Encoreable) performance;
        encoreable.eat();
        return  performance.perform();
    }
}
