package com.jiangrzc.bean;

public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
