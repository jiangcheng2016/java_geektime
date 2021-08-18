package com.jiangrzc.collection;

import java.util.Objects;

public class ReWriteEqualsAndHashCode {

    private String name;
    private String sex;
    private Integer age;
    private String adrr;

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if(!(o instanceof ReWriteEqualsAndHashCode)) return false;

        ReWriteEqualsAndHashCode that = (ReWriteEqualsAndHashCode) o;

        return this.name.equals(that.name) && this.sex.equals(that.sex) && this.adrr.equals(that.adrr) && (this.age == that.age);
    }

    @Override
    public int hashCode() {
        //1.第一种写法，利用 Object.hash，里面调用Arrays.hashCode()
        //return Objects.hash(this.name,this.sex,this.age,this.adrr);

        //2.第二种方法，
        int result = 1;

        result = this.name.hashCode();
        result += 31 * this.sex.hashCode();
        result += 31 * this.age.hashCode();
        result += 31 * this.adrr.hashCode();

        return result;

    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ReWriteEqualsAndHashCode)) return false;
//        ReWriteEqualsAndHashCode that = (ReWriteEqualsAndHashCode) o;
//        return name.equals(that.name) &&
//                sex.equals(that.sex) &&
//                age.equals(that.age) &&
//                adrr.equals(that.adrr);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, sex, age, adrr);
//    }
}

