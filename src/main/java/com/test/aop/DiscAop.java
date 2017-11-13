package com.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by K on 2017/11/12.
 */
@Aspect
@Component
public class DiscAop {
    private Map<Integer,Integer> trankCounts=new HashMap<>();
    /*参数从命名切点到通知方法转移，切点定义中的参数与切点方法中的参数名称要保持一致，目标方法中的参数会根据类型匹配到切点方法中*/
    @Pointcut("execution(* com.test.test3.Disc.play(int,String))&& args(trankNumber,s2)")
//    @Pointcut("execution(* com.test.test3.Disc2.play(int))&& args(trankNumber)")
    public void trankPlay(int trankNumber,String s2){}

    @Before("trankPlay(trank,s1)")
    public void countTranks(int trank,String s1){
        System.out.println("执行了countTranks");
        int currentCount=getCount(trank);
        trankCounts.put(trank,currentCount+1);
    }

    public int getCount(Integer trankNumber){
       return trankCounts.containsKey(trankNumber)?trankCounts.get(trankNumber):0;
    }
}
