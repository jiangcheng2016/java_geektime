package com.jiangrzc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//全注解开发
@Configuration
@ComponentScan(basePackages = {"com.jiangrzc"})
@EnableAspectJAutoProxy(proxyTargetClass = true)        //默认是 fasle 开启代理
public class Config {
}
