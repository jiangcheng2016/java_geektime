package com.jiangrzc.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class ImplementCallable implements Callable<Boolean> {

    private String url;
    private String name;

    public ImplementCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {

        DownloadPicture downloadPicture = new DownloadPicture();
        downloadPicture.downLoad(url,name);
        System.out.println("下载了文件名为:" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ImplementCallable thread1 = new ImplementCallable("https://img1.baidu.com/it/u=1605489254,3208869051&fm=26&fmt=auto&gp=0.jpg"," 1.jpg");
        ImplementCallable thread2 = new ImplementCallable("https://img1.baidu.com/it/u=2860974842,1923858555&fm=26&fmt=auto&gp=0.jpg"," 2.jpg");
        ImplementCallable thread3 = new ImplementCallable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fyouimg1.c-ctrip.com%2Ftarget%2Ftg%2F905%2F120%2F337%2Fd62b820c201c4414a962bf41461999c4_jupiter.jpg&refer=http%3A%2F%2Fyouimg1.c-ctrip.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1631282875&t=143a3d310fbd3e3c76ea6d06b00632bd"," 3.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> result1 = ser.submit(thread1);
        Future<Boolean> result2= ser.submit(thread2);
        Future<Boolean> result3 = ser.submit(thread3);

        //获取结果
        boolean r1 = result1.get();
        boolean r2 = result2.get();
        boolean r3 = result3.get();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        //关闭服务
        ser.shutdownNow();


    }
}

class DownloadPicture{

    public void downLoad(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downLoad出现问题");
        }
    }
}
