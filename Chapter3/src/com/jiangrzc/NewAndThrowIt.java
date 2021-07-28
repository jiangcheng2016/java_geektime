package com.jiangrzc;

public class NewAndThrowIt {
    public static void main(String[] args) {

    }

    //TODO 创建一个 checked Exception，用throws关键字 把异常扔出去
    //TODO 此时需要方法也要有throws 语句，同样的，throws语句的类型要覆盖实际异常的类型
    public void causeCheckedException() throws Exception {
        throw new Exception("");
    }

    //TODO 创建一个 unchecked Exception, 用throws关键字 扔出去
    //TODO 此时方法可以有throws ，也可以没有throws
    public void causeUncheckedException() throws RuntimeException{  //throws RuntimeException可以有也可以没有
        throw new RuntimeException("");
    }
}
