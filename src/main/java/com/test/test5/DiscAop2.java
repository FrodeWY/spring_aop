package com.test.test5;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mac on 2017/11/13.
 */
public class DiscAop2 {
    private Map<Integer,Integer> trankCounts=new HashMap<>();


    public void countTranks(int trank,String s1){
        System.out.println("执行了countTranks");
        int currentCount=getCount(trank);
        trankCounts.put(trank,currentCount+1);
    }

    public int getCount(Integer trankNumber){
        return trankCounts.containsKey(trankNumber)?trankCounts.get(trankNumber):0;
    }
}
