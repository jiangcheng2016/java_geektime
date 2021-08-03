package com.jiangrzc;

/**
 * 演示使用set方法进行属性注入
 */
//1.创建类
public class Book {
    //2.创建属性
    private String bname;
    private String bauthor;

    private String address;

    //3.创建属性set方法

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void bookDemo(){
        System.out.println("书的名称是:" + bname);
        System.out.println("书的作者是:" + bauthor);
        System.out.println("书的地址是:" + address);
    }
}
