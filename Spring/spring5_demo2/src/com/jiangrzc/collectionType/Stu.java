package com.jiangrzc.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 创建 Stu 类，定义数组、List、Map、Set类型属性，生成set方法
 */
public class Stu {

    //1.数组类型
    private String[] courses;
    //2.List集合
    private List<String> list;
    //3.Map集合
    private Map<String,String> maps;
    //4.set集合
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void show(){
        System.out.println("courses:" + Arrays.toString(courses));
        System.out.println("list:" + list);
        System.out.println("maps:" + maps);
        System.out.println("sets:" + sets);
    }
}
