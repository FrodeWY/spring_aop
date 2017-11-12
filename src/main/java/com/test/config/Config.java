package com.test.config;

import com.test.test1.DancePerformance;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by K on 2017/11/12.
 */
@Configuration
@ComponentScan(basePackages = "com.test")
@EnableAspectJAutoProxy
public class Config {
}
