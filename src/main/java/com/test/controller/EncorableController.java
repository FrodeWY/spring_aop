package com.test.controller;


import com.test.test1.Performance;
import com.test.test4.Encoreable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by K on 2017/11/12.
 */
@Controller
public class EncorableController {

    @Autowired
//    @Qualifier("dancePerformance")
    @Qualifier("aroundPerformance")
    private Performance performance;

    @RequestMapping("/declareParents")
    public @ResponseBody String declareParents(){
        System.out.println("declareParents");
        performance.perform();
        Encoreable encoreable= (Encoreable) performance;
        encoreable.eat();
        return "success";
    }
}
