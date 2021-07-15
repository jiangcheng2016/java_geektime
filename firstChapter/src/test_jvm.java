public class test_jvm {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(){
            //System.out.println("&*&*****");

            public void run(){
                System.out.println("-----------");
            }
        };

        t.start();
        t.join();
        //Thread.sleep(1);
        System.out.println("Thread_____");

        new Thread() {
            public void run() {
                int value = 5;
                System.out.println(value);
            }
        }.start();
        new Thread(()->{
            System.out.println("1111111");
        }).start();
    }

}
