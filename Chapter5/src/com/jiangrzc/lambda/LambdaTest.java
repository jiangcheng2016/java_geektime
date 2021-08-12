package com.jiangrzc.lambda;

public class LambdaTest {

    //3.静态内部类
    static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("I LOVE YOU -->静态内部类");
        }
    }

    public static void main(String[] args) {

        //4.局部类
        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("I LOVE YOU -->局部类");
            }
        }




        ILike like = new Like();
        like.lambda();


        like = new Like2();
        like.lambda();

        like = new Like3();
        like.lambda();

        //5.匿名内部类
        like = new ILike(){

            @Override
            public void lambda() {
                System.out.println("I LOVE YOU -->匿名内部类");
            }
        };
        like.lambda();

        //6.lambda 表达式
        like = ()->{
            System.out.println("I LOVE YOU -->lambda表达式");
        };
        like.lambda();


    }

}

//1.定义一个函数式接口
interface ILike{
    void lambda();
}

//2.定义一个实现类
class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("I LOVE YOU -->普通实现");
    }
}


