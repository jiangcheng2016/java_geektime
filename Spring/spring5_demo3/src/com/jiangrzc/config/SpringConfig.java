package com.jiangrzc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //作为配置类，替代 xml 配置文件
@ComponentScan(basePackages = {"com.jiangrzc"}) //与 <context:component-scan base-package="com.jiangrzc"></context:component-scan>等价
public class SpringConfig {
}
