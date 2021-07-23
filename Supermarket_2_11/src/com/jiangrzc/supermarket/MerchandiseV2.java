package com.jiangrzc.supermarket;

import java.util.Objects;

public class MerchandiseV2 {

    public String name;
    public String id;
    private int count;
    public double soldPrice;
    public double purchasePrice;

    public static String STATIC_MEMBER = "test static member";

    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public MerchandiseV2(String name, String id, int count, double soldPrice) {
        // double purPrice = soldPrice * 0.8;
        // this(name, id, count, soldPrice, purchasePrice);
        this(name, id, count, soldPrice, soldPrice * 0.8);
        // double purPrice = soldPrice * 0.8;
    }

    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1.1);

    }

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
            + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
            "。销售一个的毛利润是" + calculateProfit());
    }

    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
//        if(profit <= 0){
//            return 0;
//        }
        return profit;
    }

    public double buy(int count) {
        System.out.println("Merchandise里的buy(int count)");
        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }
        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，花费为" + cost);
        return cost;
    }


    public double buy(boolean reallyBuy) {
        System.out.println("Merchandise里的buy(boolean reallyBuy)");
        if (reallyBuy) {
            return this.buy(1);
        } else {
            return -1;
        }
    }

    //TODO hashCode 和 equals 是我们最常覆盖的两个方法
    //TODO 覆盖的原则是，equals 为 true, hashCode 就应该相等。这是一种约定俗成的规定。
    //TODO 即 equals 为true 是hashCode相等的充分非必要条件， hashCode相等是equals	为ture的必要不充分条件。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MerchandiseV2)) return false;
        MerchandiseV2 that = (MerchandiseV2) o;
        return this.getCount() == that.getCount() &&
                Double.compare(that.getSoldPrice(), getSoldPrice()) == 0 &&
                Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
                getName().equals(that.getName()) &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getCount(), getSoldPrice(), getPurchasePrice());
    }

    @Override
    public String toString() {
        return "MerchandiseV2{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                ", soldPrice=" + soldPrice +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public static String getNameOf(MerchandiseV2 m)
    {
        return m.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public static void staticNoOverride(){
        System.out.println("staticNoOverride in MerchandiseV2");
    }

}
