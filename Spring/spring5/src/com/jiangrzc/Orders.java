package com.jiangrzc;

/**
 * 使用有参构造注入属性
 */
public class Orders {
    //1.创建属性
    private String oname;
    private String address;

    //2.构造有参构造函数

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersDemo(){
        System.out.println("订单名称是:" + oname);
        System.out.println("订单地址是:" + address);
    }
}
