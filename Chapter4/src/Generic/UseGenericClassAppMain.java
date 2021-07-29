package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class UseGenericClassAppMain {
    public static void main(String[] args) {
//        useStringList();
        useStringListGeneric();
    }


    public static List createStringList(){
        List ret = new ArrayList();
        for(int i = 0; i < 10; i ++){
            ret.add("str" + (i % 5));
        }
        return ret;
    }

    public static void useStringList(){
        System.out.println();
        List listStr = createStringList();
        for(int i = 0; i < 10; i ++){
            // >> TODO 必须强制类型转换，心好累，我明明知道里面只有String的呀
            String str = (String) listStr.get(i);
            str = str.toUpperCase();
            System.out.println(str);
        }
    }

    // TODO 我知道我没用，我的告诉Java说这个List里面只有String，方法就是使用泛型
    public static List<String> createStringListGeneric(){
        // TODO 泛型的语法就是在支持泛型的类型上，给出类型的定义
        // TODO List接口是支持泛型的，类型就是List里面允许的类型
        // TODO 创建List实例和引用的时候，都可以(非必要)指定泛型对应的类型
        // TODO 不指定，那就是Object,所以我们之前用的List的元素就是 Object类型
        List<String> ret = new ArrayList<>();
        for (int i = 0; i< 10; i ++){
            // TODO 如果尝试强制增加非String类型的元素进去，则会报错
            ret.add("str" + (i % 5));
//            ret.add(9);
        }
        return ret;
    }

   public static void useStringListGeneric(){
        // TODO 使用List<String> 类型的引用，指向泛型的list
        List<String> listStr = createStringListGeneric();
        for(int i = 0; i < 10; i ++){
            // TODO 不用再强转，用着好方便，极度舒适
            String str = listStr.get(i).toUpperCase();
            System.out.println(str);
        }
   }
}
