package com.jiangrzc.impl;

import com.jiangrzc.intf.IntfWithEx;

public class IntfWithExImpl implements IntfWithEx {

    @Override
    public void throwsException() throws Exception {
        //TODO 接口声明中抛出了异常，实现方法中可以抛也可以不抛
        //TODO 如果抛的话，必须是接口声明中异常的子类或其本身

        throw new Exception("");
    }

    @Override
    public void unthrowsException() {
        //TODO 接口声明中没有抛出异常，实现方法中可以不抛，也可以抛RuntimeException.
        //TODO 如果抛 checked Exception，就会出错
        //throw new Exception("");
        //TODO 解决方法可以把上述 try catch 住，封装在此方法中

        try {
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO 抛 unchecked Exception 是可以的
        throw new RuntimeException("");
    }
}
