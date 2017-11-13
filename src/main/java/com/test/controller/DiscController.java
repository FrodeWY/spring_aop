package com.test.controller;

import com.test.test3.Disc;
import com.test.test5.BlankDisc2;
import com.test.test5.Disc2;
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

    @Autowired
    @Qualifier("blankDisc2")
    private Disc2 disc2;

    @RequestMapping("/getCount")
    public @ResponseBody String getCount( ){
        disc.play( 1,"s");
        return "getCount";
    }

    @RequestMapping("/getCount2")
    public @ResponseBody String getCount2( ){
        disc2.play( 1,"s");
        return "getCount";
    }
}


