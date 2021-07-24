package com.jiangrzc.supermarket;

//TODO 使用enum 声明，而非 class
public enum  Category {

    FOOD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELETHRIC(9)
    ;

    //可以有属性
    private int id;

    // 构造方法是 private 的， 不写private默认就是private
    Category(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
