package com.jiangrzc.bean;

public class Orders {

    private String oname;

    public Orders() {
        System.out.println("bean的生命周期第一步：通过构造器创建bean的实例(通过无参构造)");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("bean的生命周期第二步：为 bean 的属性设置值和对其他值得引用(通过 set 方法)");
    }

    //创建 bean 初始化方法
    public void initMethod(){
        System.out.println("bean的生命周期第四步：调用 bean 的初始化方法(需要配置,init-method=\"\")");
    }

    //创建 bean 销毁方法
    public void destoryMethod(){
        System.out.println("bean的生命周期第七步：当容器关闭的时候，调用 bean 的销毁方法(需要配置，destroy-method=\"\")");
    }

}
