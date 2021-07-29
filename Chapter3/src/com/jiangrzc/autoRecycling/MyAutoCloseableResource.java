package com.jiangrzc.autoRecycling;

import java.io.IOException;

public class MyAutoCloseableResource implements AutoCloseable{

    private String resName;
    private int counter;

    public MyAutoCloseableResource(String resName) {
        this.resName = resName;
    }

    public String read() throws IOException {
        counter ++;
        if(Math.random() > 0.1){
            return "You got lucky to read from " + resName + "for " + counter + "times";
        }else {
            throw new IOException("resource不存在哦");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源释放了：" + resName);
    }
}
