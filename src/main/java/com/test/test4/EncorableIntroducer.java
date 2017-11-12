package com.test.test4;

import com.test.test4.DefaultEncoreable;
import com.test.test4.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by K on 2017/11/12.
 */
@Aspect
@Component
public class EncorableIntroducer {
    /*通过aop给Performance所有实现引入一个接口，value 属性指定了哪种类型的bean要引入该接口，Performance+加号指的是Performance的所有实现，也可以指定某个具体的类，defaultImpl属性指定了为引入功能提供实现的类*/
    @DeclareParents(value = "com.test.test1.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}

