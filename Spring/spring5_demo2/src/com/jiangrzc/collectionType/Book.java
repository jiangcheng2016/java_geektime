package com.jiangrzc.collectionType;

import java.util.List;

public class Book {
    private List<String> bname;

    public void setBname(List<String> bname) {
        this.bname = bname;
    }

     public void show(){
         System.out.println("banme: " + bname);
     }
}
