package com.test.controller;

import com.test.test3.Disc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by K on 2017/11/12.
 */
@Controller
@RequestMapping("/disc")
public class DiscController {
    @Autowired
    @Qualifier("blankDisc")
//    @Qualifier("writerDisc")
    private Disc disc;

    @RequestMapping("/getCount")
    public @ResponseBody String getCount( ){
        disc.play( 1,"s");
        return "getCount";
    }
}


