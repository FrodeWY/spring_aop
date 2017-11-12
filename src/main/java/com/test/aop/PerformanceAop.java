package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by K on 2017/11/12.
 */
@Aspect
@Component
public class PerformanceAop {
    /*匹配 com.test.test1.Performance.perform()方法并且是sub包下的
    * execution(* com.test.test1.Performance.perform(..))，execution()匹配是连接点的执行方法，无论是哪个包只要实现了Performance接口，*(匹配任意返回值),com.test.test1.Performance方法所属的类，perform()方法，(..)无论入参是什么
     * within()限制连接点匹配指定的类型 com.test.test1.sub.*(com.test.test1.sub下任意类)
     * &&且，|| 或，！非，xml中用and，or，not*/
    @Pointcut("execution(* com.test.test1.Performance.perform(..))&&within(com.test.test1.sub.*)")
    public void before(){}

    /*bean()使用指定bean ID 或bean 名称作为参数来限制切点只匹配特定的bean*/
    @Pointcut("execution(* com.test.test1.Performance.perform(..)) && !bean(songPerformance)")
    public void beforeBean(){}

    @Pointcut("execution(String com.test.test1.Performance.perform(..))")
    public void afterReturn(){}

    @Pointcut("execution(* com.test.test1.Performance.perform(..))")
    public void afterThrow(){}
//    @Pointcut("execution(* com.test.test1.*.*(..))")
    @Pointcut("execution(* com.test.test1.Performance.perform(..))&&bean(aroundPerformance)")
    public void around(){};
    @Before("before()")
    public void beforeExecute(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature= (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        method.getParameterCount();
        System.out.println("执行了beforeExecute");

    }
    @Before("beforeBean()")
    public void beforeBeanExecute(){
        System.out.println("执行了beforeBean");
    }
    /*通知方法会在目标方法返回后调用*/
    @AfterReturning("afterReturn()")
    public void afterReturning(){
        System.out.println("执行了afterReturning");
    }
    /*通知方法会在目标方法抛出异常后调用*/
    @AfterThrowing("afterThrow()")
    public void afterThrowing(){
        System.out.println("执行了afterThrowing");
    }
    /*将前置通知后置通知异常通知写在一个通知方法*/
    @Around("around()")
    public void aroundExcute(ProceedingJoinPoint proceedingJoinPoint){

        try {
            System.out.println("方法执行前");
            proceedingJoinPoint.proceed();//将控制权交给被通知的方法，如果不调用则被通知方法被阻塞得不到调用，也可多次调用实现重试逻辑
            System.out.println("方法执行后");
        } catch (Throwable throwable) {
            System.out.println("方法出现异常");
            throwable.printStackTrace();
        }

    }
}
