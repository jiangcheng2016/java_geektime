package redisTest;

import redis.clients.jedis.Jedis;

public class Test {
    public static void main(String[] args) {
//        Jedis
        //1.new Jedis 对象
        Jedis jedis = new Jedis("47.94.150.238",6379);
        //密码
        jedis.auth("redis123");


        //Jedis 所有的命令
        System.out.println(jedis.ping());

    }
}
