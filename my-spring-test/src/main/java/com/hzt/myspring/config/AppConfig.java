package com.hzt.myspring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hzt")
@EnableAspectJAutoProxy//开启aop
public class AppConfig {
}
