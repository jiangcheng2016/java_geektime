package com.jiangrzc.supermarket;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAppMain {
    public static void main(String... arg) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int defaultCount = 200;
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, defaultCount);

        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);

        //TODO 另一种获得Class实例的方法，直接类点名
        Class clazz = MerchandiseV2.class;

        //Field countField = clazz.getField("count");
        Field countField = clazz.getDeclaredField("count"); //针对 private 变量，使用 getDeclaredField
        countField.setAccessible(true);     //强制使用代码
        System.out.println("通过反射得到的count值:" + countField.get(m100));

        countField.set(m100,998);
        System.out.println(countField.get(m100));
        System.out.println(m100.getCount());
//
//        printField(clazz);

//        Field field = clazz.getField("STATIC_MEMBER");
//        System.out.println(field.get(null));

//        Method desc_method = clazz.getMethod("describe");
//        desc_method.invoke(m100);
//        desc_method.invoke(superMarket.getMerchandiseOf(0));
//        desc_method.invoke(superMarket.getMerchandiseOf(10));
//        m100.describe();

//        Method staticMethod = clazz.getMethod("getNameOf", MerchandiseV2.class);
//        String str = (String) staticMethod.invoke(null,m100);
//        System.out.println(str);

//        Method buyMethod = clazz.getMethod("buy", int.class);
//        buyMethod.invoke(m100,1);
//        //m100.buy(1);
    }

    public static void printField(Class clazz)
    {
        System.out.println("以下是"+clazz.getName()+"里的field");
        for(Field field:clazz.getFields())
        {
            System.out.println(field.getType() + " " + field.getName());
        }
    }
}
