package com.test.test5;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by mac on 2017/11/13.
 */
public class Audience {
    public void silenceCellPhones(){
        System.out.println("silence Cell Phones");
    }
    public void takeSeats(){
        System.out.println("Taking seats");
    }
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("silence Cell Phones");
            System.out.println("Taking seats");
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Demanding a refund");
        }
    }
}
