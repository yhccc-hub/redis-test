import redis.clients.jedis.Jedis;

public class JedisKeyTest {
    public static void main(String[] args) {
        //连接redis
        Jedis jedis = new Jedis("192.168.44.128",6379);
        //
        String ping = jedis.ping();
        System.out.println(ping);
        //jedis.keys("*");
        System.out.println("hello");
        System.out.println("master test");
    }
}
