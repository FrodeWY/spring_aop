package com.test.test4;

import com.test.config.Config;
import com.test.test1.Performance;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by K on 2017/11/12.
 */

public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Performance performance= (Performance) ctx.getBean("dancePerformance");
        performance.perform();
        Encoreable encoreable= (Encoreable) performance;
        encoreable.eat();
//        Person person = (Person) ctx.getBean("women");
//        person.likePerson();
//        Animal animal = (Animal)person;
//        animal.eat();

    }
}
