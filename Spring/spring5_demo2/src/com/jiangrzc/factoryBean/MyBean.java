package com.jiangrzc.factoryBean;

import com.jiangrzc.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        Course course = new Course();
        course.setCname("这是从MyBean中返回的FactoryBean");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
