package com.test.controller;

import com.test.test5.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 2017/11/13.
 */
@Controller
public class PersonController {
    @Autowired
    @Qualifier("women2")
    private Person person;

    @RequestMapping("/women")
    public @ResponseBody String getPerson(){
        person.say();
        return "success";
    }


}
