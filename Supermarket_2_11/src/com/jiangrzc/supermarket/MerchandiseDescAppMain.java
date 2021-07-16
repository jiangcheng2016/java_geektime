package com.jiangrzc.supermarket;

public class MerchandiseDescAppMain {

    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();
        merchandise.name = "梅见";
        merchandise.id = "0098";
        merchandise.purchasePrice = 189.0;
        merchandise.soldPrice = 220.6;
        merchandise.count = 299;
        merchandise.adressFrom = "中国山东";

        merchandise.description();
    }
}
