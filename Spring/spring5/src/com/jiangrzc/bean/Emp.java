package com.jiangrzc.bean;

public class Emp {

    private String ename;
    private String egener;

    private Dept dept;

    //生成dept的get方法

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEgener(String egener) {
        this.egener = egener;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void show(){
        System.out.println(ename + "::" + egener + "::" + dept);
    }
}
