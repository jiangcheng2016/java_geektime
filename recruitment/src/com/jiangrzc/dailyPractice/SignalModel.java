package com.jiangrzc.dailyPractice;

public class SignalModel {

    private static SignalModel instance = new SignalModel();

    private SignalModel() {

    }

    public static SignalModel getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world");
    }


}
