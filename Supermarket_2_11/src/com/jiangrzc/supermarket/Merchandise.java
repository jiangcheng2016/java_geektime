package com.jiangrzc.supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public String adressFrom;

    public void description(){
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字为:"+ name + "商品id是：" + id + "。商品的售价为:"+soldPrice + "商品进价为:" + purchasePrice + "商品库存量为:"
                + count + "。销售一个的毛利润是:" + netIncome + "，产地是：" + adressFrom);
    }

}
