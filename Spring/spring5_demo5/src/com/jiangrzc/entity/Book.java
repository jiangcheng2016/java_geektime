package com.jiangrzc.entity;

public class Book {

    private String b_id;
    private String b_name;
    private String b_statu;

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_statu() {
        return b_statu;
    }

    public void setB_statu(String b_statu) {
        this.b_statu = b_statu;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id='" + b_id + '\'' +
                ", b_name='" + b_name + '\'' +
                ", b_statu='" + b_statu + '\'' +
                '}';
    }
}
