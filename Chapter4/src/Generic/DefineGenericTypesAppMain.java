package Generic;

import Generic.define.MyGenericClass;
import Generic.ext.GrandParent;
import Generic.ext.Parent;

import java.lang.reflect.Field;

// >> TODO 泛型的作用包括：1) 告诉编译器帮我们检查类型是否匹配，类型是什么不重要，类型一样才重要；
// >> TODO              2) 在使用的地方悄悄的帮我们做类型强制转换。

public class DefineGenericTypesAppMain {
    public static void main(String[] args) throws NoSuchFieldException {

        Field field2 = MyGenericClass.class.getDeclaredField("first");
        System.out.println("first的类型是:" + field2.getClass());

        MyGenericClass<String,Object> test1 = new MyGenericClass<>("inst1", new Object());
        MyGenericClass<String, Object> test2 = new MyGenericClass<>("inst2", "aabb");

        String strFirst = test1.getFirst();
        System.out.println(strFirst);

        String strSecond = (String) test2.getSecond();
        System.out.println(strSecond);

        // TODO 方法的类型参数也是一样，换到了使用的地方做类型强制转换
        String another = test1.getAnother("safe");

        // >> TODO 如果泛型信息缺失了，编译器也无法帮忙检查出类型不匹配，只能给出 unchecked 编译警告
        MyGenericClass mc = new MyGenericClass("","");
        MyGenericClass<GrandParent, Parent> cast = mc;

        //TODO >> 会出错，因为cast 指向的实例其实里面存的时两个 String
//        GrandParent a = cast.getFirst();

        //TODO >> 只调用这个方法，不会出错
        cast.getFirst();

    }
}
