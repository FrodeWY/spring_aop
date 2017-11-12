package com.test.test1;


import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/11/12.
 */
@Service
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS,value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AroundPerformance implements Performance{
    @Override
    public String perform() {
        System.out.println("AroundPerformance");
        int a=5/0;
        return "AroundPerformance";
    }

}
