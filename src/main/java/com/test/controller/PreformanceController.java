package com.test.controller;

import com.test.test1.AroundPerformance;
import com.test.test1.Performance;
import com.test.test4.Encoreable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by K on 2017/11/12.
 */
@Controller
public class PreformanceController {
    @Autowired
//    @Qualifier("dancePerformance")
//    @Qualifier("songPerformance")
    @Qualifier("songPerformance")
   private Performance performance;

    @Autowired
    @Qualifier("videoPerformance")
    private Performance performanceBean;

    @Autowired
    @Qualifier("throwPerformance")
    private Performance throwPerformance;

    @Autowired
    @Qualifier("aroundPerformance")
    private Performance aroundPerformance;

    @RequestMapping("/beforePerformance")
    public @ResponseBody String performance(){
        return  performance.perform();
    }
    @RequestMapping("/beforePerformanceBean")
    public @ResponseBody String performanceBean(){
        return  performance.perform();
    }
    @RequestMapping("/afterReturningThrowingPerformance")
    public @ResponseBody String afterReturnPerformance(int arg){
        if(arg==1){
            throwPerformance.perform();
        }
        return  performance.perform();
    }

    @RequestMapping("/aroundPerformance")
    public @ResponseBody String aroundPerformance(){
        return aroundPerformance.perform();
    }
}
