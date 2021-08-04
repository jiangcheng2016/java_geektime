package com.jiangrzc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean的生命周期第三步：在 bean 初始化之前，把 bean 实例传递给 bean后置处理器的方法 PostProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean的生命周期第五步：在 bean 初始化之前，把 bean 实例传递给 bean后置处理器的方法 PostProcessAfterInitialization");
        return bean;
    }
}
